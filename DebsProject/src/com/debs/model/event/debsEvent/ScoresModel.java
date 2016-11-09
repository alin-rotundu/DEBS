package com.debs.model.event.debsEvent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.TreeMap;



public class ScoresModel extends Observable {

	private Map<Long, Long> commentPostMap;

	private Map<Long, Post> postMap;

	private TreeMap<Long, Long> postScoreMap;


	public List<Post> getFirst3Posts(){
		List<Post> posts = new ArrayList<>();
		Collection<Long> values = postScoreMap.values();

		for(int i = 0; i < 3 && i < values.size(); i++){
			posts.add(postMap.get(postScoreMap.get(i)));
		}

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
	public Map<Long, Long> getPostScoreMap() {
		return postScoreMap;
	}
	public void setPostScoreMap(TreeMap<Long, Long> postScoreMap) {
		setChanged();
		notifyObservers();
		this.postScoreMap = postScoreMap;
	}



}
