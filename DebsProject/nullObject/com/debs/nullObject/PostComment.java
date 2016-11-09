package com.debs.nullObject;

public class PostComment {

	public static final long[] ids = {77442, 7743433, 7734343};
	
	public static AbstractComment getComment(long id){
		
	      for (int i = 0; i < ids.length; i++) {
	         if (ids[i] == (id)){
	            return new RealComment(id);
	         }
	      }
	      return new NullComment();
	   }
}
