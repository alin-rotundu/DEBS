package com.debs.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.BlockingQueue;

import com.debs.model.RawEvent;

public class CommentsLoader implements Runnable{

    protected BlockingQueue<RawEvent> commentsBlockingQueue = null;

    public CommentsLoader(BlockingQueue<RawEvent> commentsBlockingQueue) {
        this.commentsBlockingQueue = commentsBlockingQueue;
    }

    public void run() {
    	try {
    		readComments();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
    public void readComments() throws IOException{    
        FileInputStream fis = null;
        BufferedReader reader = null;
      
        try {
            fis = new FileInputStream("resources/data/comments.dat");
            reader = new BufferedReader(new InputStreamReader(fis));

            String line = reader.readLine();

            while(line != null){
            	try {	
            		RawEvent commentEvent = new RawEvent();
            		commentEvent.setIsPost(false);
            		commentEvent.setIsComment(true);
            		commentEvent.setTimestamp(DateUtils.GetEventTimestamp(line));
            		commentEvent.setData(line);
            		
            		commentsBlockingQueue.put(commentEvent);
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
            } catch (IOException ex) {
            	System.out.println("Could not close file descriptors !");
            }
        }
	}
}