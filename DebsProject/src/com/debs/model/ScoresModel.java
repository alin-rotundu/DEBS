package com.debs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;




public class ScoresModel extends Observable {

	private Map<Long, Long> commentPostMap;

	private Map<Long, Post> postMap;

	private Map<Long, List<Long>> postScoreMap;


	public List<Post> getFirst3Posts(){
		List<Post>  posts = new ArrayList<Post> ();
//		Collection<Long> values = postScoreMap.values();
//
//		for(int i = 0; i < 3 && i < values.size(); i++){
//			posts.add(postMap.get(postScoreMap.get(i)));
//		}

		return posts;
	}

	public Map<Long, Long> getCommentPostMap() {
		return commentPostMap;
	}
	
	public void setCommentPostMap(Map<Long, Long> commentPostMap) {
		setChanged();
		notifyObservers();
		this.commentPostMap = commentPostMap;
	}
	
	public Map<Long, Post> getPostMap() {
		return postMap;
	}
	
	public void setPostMap(Map<Long, Post> postMap) {
		setChanged();
		notifyObservers();
		this.postMap = postMap;
	}
	
	public Map<Long, List<Long>> getPostScoreMap() {
		return postScoreMap;
	}
	
	public void setPostScoreMap(Map<Long, List<Long>> postScoreMap) {
		setChanged();
		notifyObservers();
		this.postScoreMap = postScoreMap;
	}

	public Post getPostByCommentId(Long comment){
		return null;
	}


}
