package com.debs.utils;

import java.util.List;

import com.debs.model.Post;
import com.debs.model.Comment;;

public aspect DebuggingDAOAspect {
	

	//divideStreams(List<String> streams, int divisions
	pointcut onDivideStreams(List<String> streams) : 
		call(public List<Post> PostDAO.getPosts(List<String>)) && args(streams) || call( public List<Comment> CommentDAO.getComments(List<String>)) && args(streams);

	before(List<String> streams) : onDivideStreams(streams){
		//System.out.println("Before setGrade advice: " + thisJoinPoint.getSignature());
		//System.out.println("[ASPECTJ]" + streams);
		String source;
		if(thisJoinPoint.getSignature().toString().contains("Post")){
			source = "POST";
		} else {
			source = "COMMENT";
		}
		
		for(String string : streams){
			System.out.println("[AspectJ][" + source + "]" + string );
		}
	}
}

