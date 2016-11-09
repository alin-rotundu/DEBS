package com.debs.dao;

import java.util.List;

import com.debs.nullObject.*;

public interface PostDao {
	public List<RealPost> getAllPosts();
	public RealPost getPost(long postId);
	public void updatePost(RealPost post);
	public void deletePost(RealPost post);
}
