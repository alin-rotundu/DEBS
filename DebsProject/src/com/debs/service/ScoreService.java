package com.debs.service;

import com.debs.model.ScoresModel;

public class ScoreService {

	private ScoresModel scoresModel;
	
	public Long getPostScore(Long postId){
		return 0L;
	}
	
	public Long getCommentScore(Long commentId){
		return 0L;
	}

	public ScoresModel getScoresModel() {
		return scoresModel;
	}

	public void setScoresModel(ScoresModel scoresModel) {
		this.scoresModel = scoresModel;
	}
	
	
}
