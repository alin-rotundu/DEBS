package com.debs;

import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.debs.controller.Query1Controller;
import com.debs.model.Comment;
import com.debs.model.Event;
import com.debs.model.Post;
import com.debs.model.RawEvent;
import com.debs.utils.CommentsLoader;
import com.debs.utils.EventsOrderingThread;
import com.debs.utils.PostsLoader;

public class Main {

	public static void main(String[] args) throws ParseException, IOException {
		
		//initiate blocking queues
		BlockingQueue<RawEvent> postsBlockingQueue = new ArrayBlockingQueue<>(1024);
		BlockingQueue<RawEvent> commentsBlockingQueue = new ArrayBlockingQueue<>(1024);
		BlockingQueue<RawEvent> orderedEventsBlockingQueue = new ArrayBlockingQueue<>(1024);

		//initiate data loaders
		PostsLoader postsLoader = new PostsLoader(postsBlockingQueue);
		CommentsLoader commentsLoader = new CommentsLoader(commentsBlockingQueue);

		//initiate Ordering_Thread and Query1_Thread  
		EventsOrderingThread eventsOrderingThread = new EventsOrderingThread(postsBlockingQueue, commentsBlockingQueue, orderedEventsBlockingQueue);
		Query1Controller query1Controller = new Query1Controller(orderedEventsBlockingQueue);
		
		//start dataLoaders
		new Thread(postsLoader).start();
		new Thread(commentsLoader).start();
		
		//start orderingThread
		new Thread(eventsOrderingThread).start();
		
		//start query1
		try {
			Thread.sleep(1000);
			query1Controller.DisplayOrderedEventsIntoFile();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
