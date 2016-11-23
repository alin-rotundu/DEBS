package com.debs.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.debs.model.Comment;

public class CommentDAO {

	public List<Comment> getComments(List<String> streams) throws ParseException{
		List<Comment> comments = new ArrayList<Comment>();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");

		for (String stream : streams) {
			String [] data = stream.split("\\|");
			Date timestamp = format.parse(data[0]);
			Long id = Long.parseLong(data[1], 10);
			Long userId = Long.parseLong(data[2], 10);
			if(data[5].isEmpty()) 
				data[5] = "-1";
//			if(data[6].isEmpty()) 
//				data[6] = "-1";

//			if(data[5].equals("-1") && data[6].equals("-1"))
//				continue;
			Long commentReplied = Long.parseLong(data[5], 10);
			Long postReplied = data.length == 7 ? Long.parseLong(data[6], 10) : -1;

			Comment comment = new Comment(timestamp, id, userId, data[3], data[4], commentReplied, postReplied);

			comments.add(comment);
		}

		return comments;
	}
}
