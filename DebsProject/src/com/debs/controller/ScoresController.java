package com.debs.controller;

import com.debs.event.debsEvent.Post;
import com.debs.model.event.debsEvent.ScoresModel;
import com.debs.model.event.debsEvent.util.ScoresObserver;
import com.debs.service.PostsService;
import com.debs.view.ConsoleView;

public class ScoresController {

	private ScoresModel scoresModel;
	
	@SuppressWarnings("unused")
	private ConsoleView consoleView;

	private PostsService postsService;

	public ScoresController(){
		ScoresObserver scoresObserver = new ScoresObserver(scoresModel);
		scoresModel.addObserver(scoresObserver);
	}
	
	public void calculatePostScore(Post post){
		if(scoresModel.getPostMap().containsKey(post.getPostId())){
			scoresModel.getPostScoreMap().values().remove(post.getPostId());
		}
		
		scoresModel.getPostScoreMap().put(postsService.getPostScore(post), post.getPostId());
		
		updateAllScores();
	}

	private void updateAllScores() {
		// TODO update all scores
	}
	
}
