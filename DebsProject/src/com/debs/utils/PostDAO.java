package com.debs.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.debs.model.Post;

public class PostDAO {

	public List<Post> getPosts(List<String> streams) throws ParseException{
		List<Post> posts = new ArrayList<Post>();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");
		
		for (String stream : streams) {
			String [] data = stream.split("\\|");
			Date timestamp = format.parse(data[0]);
			Long id = Long.parseLong(data[1], 10);
			Long userId = Long.parseLong(data[2], 10);
			
			Post post = new Post(timestamp, id, userId, data[3], data[4]);
			
			posts.add(post);
		}
		
		return posts;
	}
	
	public Post getPost(String rawPost) throws ParseException{
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");
		
		String [] data = rawPost.split("\\|");
		Date timestamp = format.parse(data[0]);
		Long id = Long.parseLong(data[1], 10);
		Long userId = Long.parseLong(data[2], 10);
		Post post = new Post(timestamp, id, userId, data[3], data[4]);
		return post;
	}
}
