package com.debs.utils;

import java.util.Date;
import java.util.concurrent.BlockingQueue;
import com.debs.model.RawEvent;

public class EventsOrderingThread implements Runnable{

    protected BlockingQueue<RawEvent> postsBlockingQueue = null;
    protected BlockingQueue<RawEvent> commentsBlockingQueue = null;
    protected BlockingQueue<RawEvent> orderedEventsBlockingQueue = null;

    public EventsOrderingThread(BlockingQueue<RawEvent> postsBlockingQueue, BlockingQueue<RawEvent> commentsBlockingQueue, BlockingQueue<RawEvent> orderedEventsBlockingQueue) {
        this.postsBlockingQueue = postsBlockingQueue;
        this.commentsBlockingQueue = commentsBlockingQueue;
        this.orderedEventsBlockingQueue = orderedEventsBlockingQueue;
    }

    public void run() {
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	OrderEvents();
    }

    public void OrderEvents(){
    	int retryCounter = 0;
    	int postsRetry = 0;
    	int commentsRetry = 0;
    	
    	while(true){
    		try {
    			Date topPostTimestamp = null;
    			Date topCommentTimestamp = null;
    			RawEvent topPostEvent = null;
    			RawEvent topCommentEvent = null;
            	
    			//read top post timestamp
	            if (!postsBlockingQueue.isEmpty()){
	            	topPostTimestamp = postsBlockingQueue.peek().getTimestamp();
	            }
	            else{
	            	topPostTimestamp = null;
	            }

	            //read top comment timestamp
	            if (!commentsBlockingQueue.isEmpty()){
	            	topCommentTimestamp = commentsBlockingQueue.peek().getTimestamp();
	            }	
	            else{
	            	topCommentTimestamp = null;
	            }
	
	            //compare posts and comments timestamps
	            if (topPostTimestamp != null && topCommentTimestamp != null){
		            if(topPostTimestamp.before(topCommentTimestamp)){
		            	topPostEvent = postsBlockingQueue.take();
		            	orderedEventsBlockingQueue.put(topPostEvent);
		            	retryCounter = 0;
		            }
		            else if(topPostTimestamp.equals(topCommentTimestamp)){
		            	topPostEvent = postsBlockingQueue.take();
		            	orderedEventsBlockingQueue.put(topPostEvent);

		            	topCommentEvent = commentsBlockingQueue.take();
		            	orderedEventsBlockingQueue.put(topCommentEvent);
		            	
		            	retryCounter = 0;
		            }
		            else if(topPostTimestamp.after(topCommentTimestamp)){
		            	topCommentEvent = commentsBlockingQueue.take();
		            	orderedEventsBlockingQueue.put(topCommentEvent);
		            	retryCounter = 0;
		            }
	            }
	            else if(topPostTimestamp != null && topCommentTimestamp == null){
	            	Thread.sleep(5);
	            	commentsRetry++;
	            	
	            	if (commentsRetry == 10){
            			topPostEvent = postsBlockingQueue.take();
            			orderedEventsBlockingQueue.put(topPostEvent);
            			commentsRetry = 0;
                		retryCounter = 0;
	            	}
	            }
	            else if(topPostTimestamp == null && topCommentTimestamp != null){
	            	Thread.sleep(5);
	            	postsRetry++;
	            	
	            	if (postsRetry == 10){
		            	topCommentEvent = commentsBlockingQueue.take();
		            	orderedEventsBlockingQueue.put(topCommentEvent);
		            	postsRetry = 0;
	            		retryCounter = 0;
	            	}
            	}
        		else if(topPostTimestamp == null && topCommentTimestamp == null){
        			Thread.sleep(5);
	             	retryCounter++;
	            }
	            
	            if (retryCounter == 10){
	            	break;
	            }
    		} catch (Exception e) {
    			e.printStackTrace();
	        }
    	}
    }
}