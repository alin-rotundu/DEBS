package com.debs.controller;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.debs.model.event.debsEvent.ScoresModel;
import com.debs.service.CommentsService;
import com.debs.service.PostsService;
import com.debs.event.debsEvent.util.FileUtils;
import com.debs.model.event.debsEvent.Post;

public class ThreadPoolController{
  
    private ExecutorService postsExecutor;
    private ExecutorService commentsExecutor;
    private FileUtils fileUtils;
    
    public ThreadPoolController(){
        this.postsExecutor = Executors.newFixedThreadPool(10);
        this.commentsExecutor = Executors.newFixedThreadPool(20);
        Start();
    }
    	
    private void Start(){
    	this.fileUtils = new FileUtils();
    	
    	for (Post p : fileUtils.getAllPosts()) {
    		 Runnable postWorker = new PostsService(p);
    		 postsExecutor.execute(postWorker);
		}
    	
    	for (Comment c : fileUtils.getAllComments()) {
   		 	Runnable commentWorker = new CommentsService(c);
   		 	commentsExecutor.execute(commentWorker);
		}
    }
}