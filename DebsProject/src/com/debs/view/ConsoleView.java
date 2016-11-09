package com.debs.view;

import java.util.Iterator;

import com.debs.event.debsEvent.Comment;
import com.debs.event.debsEvent.Post;
import com.debs.util.iterators.CommentList;
import com.debs.util.iterators.PostList;
@SuppressWarnings("rawtypes")
public class ConsoleView {
	
	public void displayTop3Posts(PostList posts){
		Iterator postIterator = posts.createIterator();
		while(postIterator.hasNext()){
			System.out.println(((Post)postIterator.next()).toString());
		}
	}
	
	public void displayTopKComments(CommentList comments, int k){
		Iterator commentsIterator = comments.createIterator();
		for(int i = 0; i<k && commentsIterator.hasNext(); i++){
			System.out.println(((Comment)commentsIterator.next()).toString());
		}
	}
}
