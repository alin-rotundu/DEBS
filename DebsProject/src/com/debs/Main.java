package com.debs;

import java.io.IOException;
import java.text.ParseException;

import com.debs.controller.Query1Controller;

public class Main {

	public static void main(String[] args) throws ParseException, IOException {
		
		Query1Controller controller = new Query1Controller();
		controller.readAllPosts();
	}
}
