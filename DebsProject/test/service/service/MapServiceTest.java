package service.service;


import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import com.debs.model.Post;
import com.debs.model.ScoresModel;
import com.debs.service.MapService;

public class MapServiceTest {

	private static MapService mapService;
	
	@BeforeClass
	public static void init(){
		mapService = new MapService();
		mapService.setScoresModel(new ScoresModel());
		
		Map<Long, Long> commentPostMap = new HashMap<Long, Long>();
		Map<Long, Post> postMap = new HashMap<Long, Post>();
		Map<Long, List<Long>> postScoreMap = new HashMap<Long, List<Long>>();
		
		mapService.getScoresModel().setPostMap(postMap);
		mapService.getScoresModel().setCommentPostMap(commentPostMap);
		mapService.getScoresModel().setPostScoreMap(postScoreMap);
	}

	@Test
	public void updatePostMapTest() {
		Post post = new Post();
		post.setId(1L);
		post.setMessage("NewMessage");

		mapService.updatePostMap(post);

		assertTrue(mapService.getScoresModel().getPostMap().containsKey(post.getId()));
		assertTrue(mapService.getScoresModel().getPostMap().get(post.getId()).equals(post));
	}

	@Test
	public void updateCommentPostMapTest() {

		mapService.updateCommentPostMap(34L, 23L);

		assertTrue(mapService.getScoresModel().getCommentPostMap().containsKey(34L));
		assertTrue(mapService.getScoresModel().getCommentPostMap().get(34L).equals(23L));
	}
	
	@Test
	public void updatePostScoreTest() {

		mapService.updatePostScoreMap(12L, 10L, 5L);

		assertTrue(mapService.getScoresModel().getPostScoreMap().containsKey(12L));
		assertTrue(mapService.getScoresModel().getPostScoreMap().get(12L).contains(5L));
		
		assertTrue(mapService.getScoresModel().getPostScoreMap().containsKey(10L));
		assertTrue(!mapService.getScoresModel().getPostScoreMap().get(10L).contains(5L));
	}
	
	@Test
	public void updatePostScoreNullTest() {

		mapService.updatePostScoreMap(12L, null, 5L);

		assertTrue(mapService.getScoresModel().getPostScoreMap().containsKey(12L));
		assertTrue(mapService.getScoresModel().getPostScoreMap().get(12L).contains(5L));
	}
}
