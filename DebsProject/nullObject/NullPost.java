package com.debs.nullObject;

public class NullPost extends AbstractPost  {

	@Override
	public String getPostContent() {
		return "This post is corrupt.";
	}

	@Override
	public boolean isNil() {
		return true;
	}

}
