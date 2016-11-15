package com.debs.service;

import com.debs.model.Post;
import com.debs.model.ScoresModel;

public class MapService {

	private ScoresModel scoresModel = new ScoresModel();

	public void updatePostScoreMap(Long newScore, Long oldScore, Long postId) {
		if (oldScore == null){
			scoresModel.getPostScoreMap().get(newScore).add(postId);
		} else if (!newScore.equals(oldScore)) {
			scoresModel.getPostScoreMap().get(oldScore).remove(postId);
			scoresModel.getPostScoreMap().get(newScore).add(postId);
		}
	}

	public void updatePostMap(Post post) {
		scoresModel.getPostMap().put(post.getId(), post);
	}

	public void updateCommentPostMap(Long commentId, Long postId) {
		scoresModel.getCommentPostMap().put(commentId, postId);
	}

	public ScoresModel getScoresModel() {
		return scoresModel;
	}

	public void setScoresModel(ScoresModel scoresModel) {
		this.scoresModel = scoresModel;
	}

}
