package com.debs.event.debsEvent.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.debs.nullObject.RealPost;

public class FileUtils {

	public List<RealPost> getAllPosts(){
		
		List<RealPost> posts = new ArrayList<RealPost>();
		String file = "resources\\posts.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       // process the line.
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return posts;
	}
}
