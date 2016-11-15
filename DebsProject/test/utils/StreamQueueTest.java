package utils;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.debs.utils.FileUtils;
import com.debs.utils.StreamQueue;

public class StreamQueueTest {

	@Test
	public void givenLargeArraySplitIntoSmallArrays() throws IOException{
		List<String> posts = FileUtils.readFileToStream("resources/data/posts.dat");
		List<List<String>> queuedPosts = StreamQueue.divideStreams(posts, 200);
		System.out.println(queuedPosts.size());
		assertTrue(queuedPosts.size() == 2176);
	}

}