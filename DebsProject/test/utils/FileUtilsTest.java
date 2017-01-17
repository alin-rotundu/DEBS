package utils;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import com.debs.utils.FileUtils;

public class FileUtilsTest {

	@Test
	public void givenCorrectFilePathReturnTheCorrectNumberOfRows() throws IOException {
		ArrayList<String> fullList = (ArrayList<String>) FileUtils.readFileToStream("resources/data/posts.dat");
		System.out.println(fullList.size());
		assertTrue(fullList.size() == 435125);
	}

	@Test(expected=FileNotFoundException.class)
	public void givenIncorrectFilePathThrowError() throws IOException{
		try{
			FileUtils.readFileToStream("badPath");
		} catch(FileNotFoundException e){
			throw e;
		} catch (IOException e) {
			throw e;
		}
	}
}
