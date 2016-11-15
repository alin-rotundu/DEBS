package com.debs.service;

import com.debs.model.ScoresModel;

public class ScoreService {

	private ScoresModel scoresModel = new ScoresModel();
	
	public Long getPostScore(Long postId){
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
