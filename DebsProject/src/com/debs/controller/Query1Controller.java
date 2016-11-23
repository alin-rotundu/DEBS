package com.debs.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.debs.model.Comment;
import com.debs.model.Event;
import com.debs.model.Post;
import com.debs.service.MapService;
import com.debs.service.ScoreService;
import com.debs.utils.CommentDAO;
import com.debs.utils.EventComparator;
import com.debs.utils.FileUtils;
import com.debs.utils.PostDAO;
import com.debs.utils.StreamQueue;
import com.debs.view.ConsoleView;

public class Query1Controller {
	public static final String POSTS_FILENAME = "posts.txt";
	public static final String COMMENTS_FILENAME = "comments.txt";


	private ConsoleView consoleView;
	PostDAO postDAO = new PostDAO();
	CommentDAO commentDAO = new CommentDAO();
	StreamQueue streamQueue = new StreamQueue();
	MapService mapService = new MapService();
	ScoreService scoreService = new ScoreService(mapService.getScoresModel());


	public Query1Controller(){
		consoleView = new ConsoleView();
	}
	public void readAllPosts() throws IOException, ParseException{
		
		//Read all data from file
		List<String> postsStreams = FileUtils.readFileToStream("resources/data/posts.dat");
		List<String> commentsStreams = FileUtils.readFileToStream("resources/data/comments.dat");
		
		//Parse the raw data and create lists of objects
		List<Post> posts = postDAO.getPosts(postsStreams);
		List<Comment> comments = commentDAO.getComments(commentsStreams);
		
		//Merge data into a single list
		List<Event> events = new ArrayList<Event>();
		events.addAll(posts);
		events.addAll(comments);
		
		//Sort the events by their timestamp
		Collections.sort(events, new EventComparator());
		
		//Split the events into blocks of 300
		List<List<Event>> dividedEventsStreams = streamQueue.divideEventStreams(events, 300);
		
		//While there are divided posts or comments do
		int i = 0;
		while( i < dividedEventsStreams.size() ) {
			List<Event> currentEvents = dividedEventsStreams.get(i);

			for(Event event : currentEvents){
				
				//Is Post
				if (event instanceof Post) {
					Post post;
					
					try {
						post = (Post)event;
					} 
					catch (ClassCastException e) {
						throw e;
					}
					
					if (post != null){
						updatePostMaps(post);
					}
					
					continue;
				}
				
				//Is Comment
				if (event instanceof Comment) {
					Comment comment;
					
					try {
						comment = (Comment)event;
					} 
					catch (ClassCastException e) {
						throw e;
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
			}
			
			updateView();
			i++;
		}
		
		/*if( i < dividedEventsStreams.size()){
			List<Post> posts = postDAO.getPosts(dividedPostsStreams.get(i));
			for(Post post : posts){
				updatePostMaps(post);
			}
			updateView();
		}

		else if( j < dividedCommentsStreams.size()){
			List<Comment> comments = commentDAO.getComments(dividedCommentsStreams.get(i));

			for(Comment comment : comments){
				mapService.updateCommentMap(comment);
				Post postByCommentId = mapService.getScoresModel().getPostByCommentId(comment.getId());
				mapService.updateCommentPostMap(comment.getId(), postByCommentId.getId());
				updatePostMaps(postByCommentId);
			}
			updateView();		
		}*/
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
