package com.debs.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.TreeMap;

public class ScoresModel extends Observable {

	private Map<Long, Long> commentPostMap;

	private Map<Long, Post> postMap;

	private Map<Long, List<Long>> postScoreMap;

	private Map<Long, Comment> commentMap;
	
	public ScoresModel(){
		commentPostMap = new HashMap<>();
		postMap = new HashMap<>();
		postScoreMap = new TreeMap<>();
		commentMap = new HashMap<>();
	}

	public List<Post> getFirst3Posts(){
		List<Post>  posts = new ArrayList<Post> ();
		Collection<List<Long>> values = postScoreMap.values();

		for(int i = 0; i < 3 && i < values.size(); i++){	
			for(Long id : postScoreMap.get(i)){
				posts.add(postMap.get(id));
			}
		}

		return posts;
	}

	public Post getPostByCommentId(Long comment){
		return postMap.get(commentPostMap.get(comment));
	}

	
	public Map<Long, Long> getCommentPostMap() {
		return commentPostMap;
	}

	public void setCommentPostMap(Map<Long, Long> commentPostMap) {
		this.commentPostMap = commentPostMap;
	}

	public Map<Long, Post> getPostMap() {
		return postMap;
	}

	public void setPostMap(Map<Long, Post> postMap) {
		this.postMap = postMap;
	}

	public Map<Long, List<Long>> getPostScoreMap() {
		return postScoreMap;
	}

	public void setPostScoreMap(Map<Long, List<Long>> postScoreMap) {
		this.postScoreMap = postScoreMap;
	}

	public Map<Long, Comment> getCommentMap() {
		return commentMap;
	}

	public void setCommentMap(Map<Long, Comment> commentMap) {
		this.commentMap = commentMap;
	}



}
