import com.debs.model.Comment;
import com.debs.model.Post;

public aspect ScoreTracking {

	private static int countPost = 0;
	private static int countComment = 0;
	
	public void Post.increment(){
		countPost++;
	}
	
	public void Comment.increment(){
		countComment++;
	}
	
	public int Post.getCount(){
		return countPost;
	}
	
	public int Comment.getCount(){
		return countComment;
	}
	
	pointcut changePostScore(Post p, Long s) : 
		call (public void com.debs.model.Post.setScore(Long))
		&& args(s) && target(p);
	
	before(Post p, Long s) : changePostScore(p, s){
		System.out.println("Method " + thisJoinPoint.getSignature() + " changes the post score");
	}
	
	before(Post p, Long s) : changePostScore(p, s){
		p.increment();
		System.out.println("Post score changes from  " + p.getScore() + " to " + s);
		System.out.println("Post score has been changed " + p.getCount() + " times.");
	}
	
	pointcut changeCommentScore(Comment c, Long s) : 
		call (public void com.debs.model.Comment.setScore(Long))
		&& args(s) && target(c);
	
	before(Comment c, Long s) : changeCommentScore(c, s){
		System.out.println("Method " + thisJoinPoint.getSignature() + " changes the comment score");
	}
	
	before(Comment c, Long s) : changeCommentScore(c, s){
		c.increment();
		System.out.println("Comment score changes from  " + c.getScore() + " to " + s);
		System.out.println("Comment score has been changed " + c.getCount() + " times.");
	}
}
