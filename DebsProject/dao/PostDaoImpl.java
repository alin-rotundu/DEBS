package com.debs.dao;

import java.util.List;

import com.debs.nullObject.RealPost;

public class PostDaoImpl implements PostDao {

	List<RealPost> posts;
	
	@Override
	public List<RealPost> getAllPosts() {
		return posts;
	}

	@Override
	public RealPost getPost(long postId) {
		for(RealPost rp : posts) { 
			   if(rp.getId() == postId) { 
			       return rp;
			   }
			}
		return null;
	}

	@Override
	public void updatePost(RealPost post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePost(RealPost post) {
		// TODO Auto-generated method stub
		
	}

}
