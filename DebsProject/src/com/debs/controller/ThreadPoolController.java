package com.debs.controller;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.debs.model.event.debsEvent.ScoresModel;
import com.debs.service.PostsService;
import com.debs.event.debsEvent.util.FileUtils;
import com.debs.model.event.debsEvent.Post;

public class ThreadPoolController{
  
    private ExecutorService executor;
    
    public ThreadPoolController(){
        this.executor = Executors.newFixedThreadPool(10);
        ProcessPosts();
    }
    	
    private void ProcessPosts(){
    	FileUtils fileUtils = new FileUtils();
    	
    	for (Post p : fileUtils.getAllPosts()) {
    		 Runnable postWorker = new PostsService(Post p);
             executor.execute(postWorker);
		}
    }
}