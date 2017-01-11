package com.debs.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.BlockingQueue;

import com.debs.model.RawEvent;

public class PostsLoader implements Runnable{

    protected BlockingQueue<RawEvent> postsBlockingQueue = null;

    public PostsLoader(BlockingQueue<RawEvent> postsBlockingQueue) {
        this.postsBlockingQueue = postsBlockingQueue;
    }
    
    public void run() {
    	try {
			readPosts();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public void readPosts() throws IOException{    
        FileInputStream fis = null;
        BufferedReader reader = null;
      
        try {
            fis = new FileInputStream("resources/data/posts.dat");
            reader = new BufferedReader(new InputStreamReader(fis));

            String line = reader.readLine();

            while(line != null){
            	try {	
            		RawEvent postEvent = new RawEvent();
            		postEvent.setIsPost(true);
            		postEvent.setIsComment(false);
            		postEvent.setTimestamp(DateUtils.GetEventTimestamp(line));
            		postEvent.setData(line);
            		
            		postsBlockingQueue.put(postEvent);
            		line = reader.readLine();
            	} catch (InterruptedException e) {
            		e.printStackTrace();
            	}
            } 
        } finally {
            try {
            	if(reader != null)
            		reader.close();
            	if(fis != null)
            		fis.close();
            } catch (IOException exception) {
            	System.out.println("Could not close file descriptors!");
            }
        }
	}
}
