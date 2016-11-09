package com.debs.view;

import java.util.List;

import com.debs.model.event.debsEvent.Comment;
import com.debs.model.event.debsEvent.Post;

public class ConsoleView {
	
	public void displayTop3Posts(List<Post> posts){
		for(int i = 0; i < 3 && i < posts.size(); i++){
			System.out.println(i + ". " + posts.get(i).toString());
		}
	}
	
	public void displayTopKComments(List<Comment> comments, int k){
		for(int i = 0; i < 3 && i < comments.size() && i < k; i++){
			System.out.println(i + ". " + comments.get(i).toString());
		}
	}
}
