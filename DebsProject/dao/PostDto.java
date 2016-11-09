package com.debs.dao;

import java.util.ArrayList;
import java.util.List;

import com.debs.nullObject.RealPost;

public class PostDto {
private String content;
	
	public PostDto getPost(long postId) {
		PostDaoImpl postDao = new PostDaoImpl();
		PostDto postDto = new PostDto();
		
		RealPost rp = postDao.getPost(postId);
		
		postDto.setContent(rp.content);
		return postDto;
	}
	
	public List<PostDto> getPosts() {
		PostDaoImpl postDao = new PostDaoImpl();
		List<PostDto> postsDto = new ArrayList<PostDto>();
		
		List<RealPost> rp = postDao.getAllPosts();
		
		for (RealPost realPost : rp) {
			PostDto pDto = new PostDto();
			pDto.content = realPost.content;
			
			postsDto.add(pDto);
		}
		return postsDto;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
