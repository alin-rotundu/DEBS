package com.debs.controller;

import javax.inject.Singleton;

import com.debs.model.event.debsEvent.Post;
import com.debs.model.event.debsEvent.impl.PostImpl;

public class SingletonController {

	private static Singleton singleton;

	   /* A private Constructor prevents any other
	    * class from instantiating.
	    */
	   private SingletonController() { }

	   /* Static 'instance' method */
	   public static Singleton getInstance( ) {
	      return singleton;
	   }

	   /* Other methods protected by singleton-ness */
	   protected static void start( ) {
	      ScoresController scoresController = new ScoresController();
	      Post P = new PostImpl();
	      scoresController.calculatePostScore(P);
	   }
}
