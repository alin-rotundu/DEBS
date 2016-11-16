package com.debs.utils;

import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateUtils {

	private static final  Date TODAY = new Date();

	public static  Long getTimeStampScore(Date timestamp) throws ParseException{ // returns score
		//ChronoUnit.DAYS.between(TODAY,timestamp);	 // java8 impl
		
		long diff = TODAY.getTime() - timestamp.getTime();
		int numberOfDays = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		
		return numberOfDays * 10L;
	}
}
