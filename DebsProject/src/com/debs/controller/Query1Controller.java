package com.debs.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;

import com.debs.model.Comment;
import com.debs.model.Event;
import com.debs.model.Post;
import com.debs.model.RawEvent;
import com.debs.service.MapService;
import com.debs.service.ScoreService;
import com.debs.utils.CommentDAO;
import com.debs.utils.DateUtils;
import com.debs.utils.PostDAO;
import com.debs.view.ConsoleView;

public class Query1Controller{
	protected BlockingQueue<RawEvent> orderedEventsBlockingQueue = null;
	private ConsoleView consoleView;
	PostDAO postDAO = new PostDAO();
	CommentDAO commentDAO = new CommentDAO();
	MapService mapService = new MapService();
	ScoreService scoreService = new ScoreService(mapService.getScoresModel());

	public Query1Controller(BlockingQueue<RawEvent> orderedEventsBlockingQueue) {
        this.orderedEventsBlockingQueue = orderedEventsBlockingQueue;
        consoleView = new ConsoleView();
    }

	public void Start(){
		int retryCounter = 0;
		Date oldDate = null;
		
	    while(true){
    		try {
	            if (!orderedEventsBlockingQueue.isEmpty()){ 
	            	RawEvent event = orderedEventsBlockingQueue.take();
	            	Date newDate = event.getTimestamp();
	            	if(oldDate == null){
	            		oldDate=newDate;
	            	}
	            	Long decreaseAmount = DateUtils.decreaseScoreByAmount(oldDate, newDate);
	            	if(decreaseAmount > 0){
	            		scoreService.decreaseScores(decreaseAmount);
	            	}
	            	//Is Post
					if (event.getIsPost()) {
						Post post = null; 

						try {
							post = postDAO.getPost(event.getData());
						} 
						catch (Exception e) {
							e.printStackTrace();
						}
						
						if (post != null){
							updatePostMaps(post);
						}
						
						continue;
					}
					
					//Is Comment
					if (event.getIsComment()) {
						Comment comment = null;

						try {
							comment = commentDAO.getComment(event.getData());
						} 
						catch (Exception e) {
							e.printStackTrace();
						}
						
						if (comment != null){
							mapService.updateCommentMap(comment);
							Post postByCommentId = mapService.getScoresModel().getPostByCommentId(comment.getId());
							mapService.updateCommentPostMap(comment.getId(), postByCommentId.getId());
							//TODO update post score by its comments
							
							postByCommentId.setScore(postByCommentId.getScore() + comment.getScore());
							
							updatePostMaps(postByCommentId);
						}
						
						continue;
					}			
					
					updateView();
					
	            	retryCounter = 0;
	            }
	            else{
	             	Thread.sleep(10);
	             	retryCounter++;
	            }
	            
	            if (retryCounter == 20){
	            	break;
	            }
            } catch (Exception e) {
            	e.printStackTrace();
	        }
    	}
	}
	
	public void DisplayOrderedEventsIntoFile(){
		int retryCounter = 0;
	    String filename = "resources/data/log.txt";
	    FileWriter fw = null;
		try {
			fw = new FileWriter(filename, true);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	    while(true){
    		try {
	            if (!orderedEventsBlockingQueue.isEmpty()){ 
	            	try
	            	{
	            	    fw.write(orderedEventsBlockingQueue.take().getData() + "\n");
	            	}
	            	catch(IOException ioe)
	            	{
	            	    System.err.println("IOException: " + ioe.getMessage());
	            	}
//	            	System.out.println(orderedEventsBlockingQueue.take());
	            	retryCounter = 0;
	            }
	            else{
	             	Thread.sleep(10);
	             	retryCounter++;
	            }
	            
	            if (retryCounter == 20){
            	    fw.close();
	            	break;
	            }
            } catch (Exception e) {
            	e.printStackTrace();
	        }
    	}
	}
		
	private void updateView() {
		consoleView.displayTop3Posts(mapService.getScoresModel().getFirst3Posts());
	}
	
	private void updatePostMaps(Post post) {
		mapService.updatePostMap(post);
		Long postScore = scoreService.getPostScore(post.getId());
		post.setScore(postScore);
		mapService.updatePostScoreMap(postScore, scoreService.getPostOldScore(post.getId()), post.getId());
	}

}
