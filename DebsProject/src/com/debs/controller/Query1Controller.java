package com.debs.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import com.debs.model.Comment;
import com.debs.model.Post;
import com.debs.service.MapService;
import com.debs.service.ScoreService;
import com.debs.utils.CommentDAO;
import com.debs.utils.FileUtils;
import com.debs.utils.PostDAO;
import com.debs.utils.StreamQueue;
import com.debs.view.ConsoleView;

public class Query1Controller {
	public static final String POSTS_FILENAME = "posts.txt";
	public static final String COMMENTS_FILENAME = "comments.txt";


	private ConsoleView consoleView;
	PostDAO postDAO = new PostDAO();
	CommentDAO commentDAO = new CommentDAO();
	StreamQueue streamQueue = new StreamQueue();
	MapService mapService = new MapService();
	ScoreService scoreService = new ScoreService(mapService.getScoresModel());

	public Query1Controller(){
		consoleView = new ConsoleView();
	}
	public void readAllPosts() throws IOException, ParseException{
		List<String> postsStreams = FileUtils.readFileToStream("resources/data/posts.dat");
		List<String> commentsStreams = FileUtils.readFileToStream("resources/data/comments.dat");

		List<List<String>> dividedPostsStreams = streamQueue.divideStreams(postsStreams, 300);
		List<List<String>> dividedCommentsStreams = streamQueue.divideStreams(commentsStreams, 300);

		//while there are divided posts or comments do
		//List<Post> posts = postDAO.getPosts(dividedStream);

		int i = 0, j = 0;
		while( i < dividedPostsStreams.size() || j < dividedCommentsStreams.size()) {
			List<Post> posts = postDAO.getPosts(dividedPostsStreams.get(i));
			List<Comment> comments = commentDAO.getComments(dividedCommentsStreams.get(i));

			for(Post post : posts){
				updatePostMaps(post);
			}

			for(Comment comment : comments){
				mapService.updateCommentMap(comment);
				Post postByCommentId = mapService.getScoresModel().getPostByCommentId(comment.getId());
				mapService.updateCommentPostMap(comment.getId(), postByCommentId.getId());
				//TODO update post score by its comments
				
				postByCommentId.setScore(postByCommentId.getScore() + comment.getScore());
				
				updatePostMaps(postByCommentId);
			}
			updateView();
		}

		if( i < dividedPostsStreams.size()){
			List<Post> posts = postDAO.getPosts(dividedPostsStreams.get(i));
			for(Post post : posts){
				updatePostMaps(post);
			}
			updateView();
		}

		else if( j < dividedCommentsStreams.size()){
			List<Comment> comments = commentDAO.getComments(dividedCommentsStreams.get(i));

			for(Comment comment : comments){
				mapService.updateCommentMap(comment);
				Post postByCommentId = mapService.getScoresModel().getPostByCommentId(comment.getId());
				mapService.updateCommentPostMap(comment.getId(), postByCommentId.getId());
				updatePostMaps(postByCommentId);
			}
			updateView();		
		}
	}
	
	private void updateView() {
		consoleView.displayTop3Posts(mapService.getScoresModel().getFirst3Posts());
	}
	
	private void updatePostMaps(Post post) {
		mapService.updatePostMap(post);
		Long postScore = scoreService.getPostScore(post.getId());
		post.setScore(postScore);
		mapService.updatePostScoreMap(postScore, scoreService.getPostOldScore(post.getId()), post.getId());
	}

}
