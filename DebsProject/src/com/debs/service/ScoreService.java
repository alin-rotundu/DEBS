package com.debs.service;

import com.debs.model.ScoresModel;

public class ScoreService {

	private ScoresModel scoresModel; 
	
	public ScoreService(ScoresModel scoresModel) {
		this.scoresModel = scoresModel;
	}
	
	
	public Long getPostScore(Long postId){
		return 10L;
	}
	
	public Long getPostOldScore(Long postId){
		return scoresModel.getPostMap().get(postId).getScore();
	}
	
	
	
	public Long getCommentScore(Long commentId){
		return 10l;
	}
	
	public ScoresModel getScoresModel() {
		return scoresModel;
	}

	public void setScoresModel(ScoresModel scoresModel) {
		this.scoresModel = scoresModel;
	}
	
	
}
