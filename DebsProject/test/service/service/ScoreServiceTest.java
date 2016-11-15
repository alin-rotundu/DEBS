package service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import com.debs.model.Post;
import com.debs.model.ScoresModel;
import com.debs.service.ScoreService;

public class ScoreServiceTest {
	
	private static ScoreService scoreService;
	
	@BeforeClass
	public static void init(){
		scoreService = new ScoreService();
		scoreService.setScoresModel(new ScoresModel());
		
		Map<Long, Long> commentPostMap = new HashMap<Long, Long>();
		Map<Long, Post> postMap = new HashMap<Long, Post>();
		Map<Long, List<Long>> postScoreMap = new HashMap<Long, List<Long>>();
		
		scoreService.getScoresModel().setPostMap(postMap);
		scoreService.getScoresModel().setCommentPostMap(commentPostMap);
		scoreService.getScoresModel().setPostScoreMap(postScoreMap);
	}

	@Test
	public void getPostScoreTest() {

//		scoreService.getScoresModel().getPostScoreMap().put(23L, new ArrayList<Long>());
//		scoreService.getScoresModel().getPostScoreMap().get(23L).add(12L);

		assertTrue(scoreService.getPostScore(23L).equals(10L));
	}
	
	@Test
	public void getCommentScoreTest() {

		assertTrue(scoreService.getCommentScore(23L).equals(10L));
	}
}
