package com.debs.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
	
	public static List<String> readFileToStream(String filename) throws IOException{    
        FileInputStream fis = null;
        BufferedReader reader = null;
        List<String> twitterRows = new ArrayList<String>();
      
        try {
            fis = new FileInputStream(filename);
            reader = new BufferedReader(new InputStreamReader(fis));
            String line = reader.readLine();
            while(line != null){
               twitterRows.add(line);
               line = reader.readLine();
            } 
            return twitterRows;
        } finally {
            try {
            	if(reader != null)
            		reader.close();
            	if(fis != null)
            		fis.close();
            } catch (IOException ex) {
            	System.out.println("Could not close file descriptors!");
            }
        }
	}
	
}
