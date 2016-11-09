package com.debs.util.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.debs.model.event.debsEvent.Post;
@SuppressWarnings("rawtypes")
public class CommentList implements CustomIterator  {
	private List<Post> comments;
	
	CommentList(){
		this.comments = new ArrayList<Post>();
	}

	CommentList(List<Post> posts){
		this.comments = posts;
	}
	
	public void add (Post p){
		this.comments.add(p);
	}
	
	public Post get(int pos){
		return comments.get(pos);
	}

	
	@Override
	public Iterator createIterator() {
		return comments.iterator();
	}

	

}
