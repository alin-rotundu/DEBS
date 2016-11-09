package com.debs.dao;

import java.util.ArrayList;
import java.util.List;

import com.debs.nullObject.RealComment;

public class CommentDto {

	private String content;
	
	public CommentDto getComment(long commentId) {
		CommentDaoImpl commentDao = new CommentDaoImpl();
		CommentDto commentDto = new CommentDto();
		
		RealComment rc = commentDao.getComment(commentId);
		
		commentDto.setContent(rc.content);
		return commentDto;
	}
	
	public List<CommentDto> getComments() {
		CommentDaoImpl commentDao = new CommentDaoImpl();
		List<CommentDto> commentsDto = new ArrayList<CommentDto>();
		
		List<RealComment> rc = commentDao.getAllComments();
		
		for (RealComment realComment : rc) {
			CommentDto cDto = new CommentDto();
			cDto.content = realComment.content;
			
			commentsDto.add(cDto);
		}
		return commentsDto;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
