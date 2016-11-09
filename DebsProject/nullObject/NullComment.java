package com.debs.nullObject;

public class NullComment extends AbstractComment  {

	@Override
	public String getCommentContent() {
		return "This comment is corrupt.";
	}

	@Override
	public boolean isNil() {
		return true;
	}

}
