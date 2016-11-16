package com.debs.view;

import java.util.List;

import com.debs.model.Comment;
import com.debs.model.Post;

public class ConsoleView {

	public void displayTop3Posts(List<Post> posts){

		for (Post post : posts) {
			System.out.println(post.getFormattedPost());
		}
	}

	public void displayTopKComments(List<Comment> comments, int k){

		for (Comment comment : comments) {
			System.out.println(comment.getFormattedComment());
		}
	}
}