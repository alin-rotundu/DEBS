package com.debs.util.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.debs.event.debsEvent.Post;

public class PostList implements CustomIterator  {
	private List<Post> posts;
	
	public PostList(){
		this.posts = new ArrayList<Post>();
	}

	public PostList(List<Post> posts){
		this.posts = posts;
	}
	
	public void add (Post p){
		this.posts.add(p);
	}
	
	public Post get(int pos){
		return posts.get(pos);
	}
	@SuppressWarnings("rawtypes")
	@Override
	public Iterator createIterator() {
		return posts.iterator();
	}

	

}
