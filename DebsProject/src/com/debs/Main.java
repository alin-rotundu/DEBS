package com.debs;

import java.io.IOException;
import java.text.ParseException;

import com.debs.controller.Query1Controller;
import com.debs.model.Comment;
import com.debs.model.Post;

public class Main {

	public static void main(String[] args) throws ParseException, IOException {
		
//		Query1Controller controller = new Query1Controller();
//		controller.readAllPosts();
		
		Post post = new Post();
		post.setScore(10L);
		post.setScore(9L);
		
		Comment comment = new Comment();
		comment.setScore(7L);
		comment.setScore(6L);
	}
}
