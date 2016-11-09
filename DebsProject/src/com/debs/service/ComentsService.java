package com.debs.service;

import java.util.Map;

import com.debs.model.event.debsEvent.ScoresModel;

public class CommentsService implements Runnable {

	private ScoresModel scoresModel;
    private Comment comment;
    
    public CommentsService(Comment C){
    	this.comment = C;
    	this.scoresModel = new ScoresModel();
    }
    
    @Override
    public void run(){
    	Map<Long, Long> commentPostMap = scoresModel.getCommentPostMap();
    	commentPostMap.put(comment.comment_id, comment.post_commented);
    	
    	processTimeWindow(comment);
    	updatePostScoreMap(postScoreMap, comment.post_commented);
    }
    
    private long processTimeWindow(Comment comment){
    	// process the time window
    }
    
    private long updatePostScoreMap(Map<Long, Long> postScoreMap, Long postId){
    	// update the post after its score has changed
    }