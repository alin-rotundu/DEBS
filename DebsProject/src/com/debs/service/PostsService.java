package com.debs.service;

import java.util.Map;
import com.debs.event.debsEvent.Post;
import com.debs.model.event.debsEvent.ScoresModel;

public class PostsService implements Runnable {

	private ScoresModel scoresModel;
    private Post post;
    
    public PostsService(Post P){
    	this.post = P;
    	this.scoresModel = new ScoresModel();
    }
    
    @Override
    public void run(){
    	Map<Long, Post> postMap = scoresModel.getPostMap();
    	Map<Long, Long> postScoreMap = scoresModel.getPostScoreMap();
    	
    	postMap.put(post.Id, post);
    	postScoreMap.put(getPostScore(post), post.Id);
    	
    	processTimeWindow(post);
    	updatePostScoreMap(postScoreMap, post);
    }

    private long getPostScore(Post post){
    	// calcultate the score of the post
    }
    
    private long processTimeWindow(Post post){
    	// process the time window
    }
    
    private long updatePostScoreMap(Map<Long, Long> postScoreMap, Post post){
    	// update the post after its score has changed
    }
}
