package com.debs.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateUtils {

	private static final  Date TODAY = new Date();

	public static Long getTimeStampScore(Date timestamp) throws ParseException{ // returns score
		//ChronoUnit.DAYS.between(TODAY,timestamp);	 // java8 impl
		
		long diff = TODAY.getTime() - timestamp.getTime();
		int numberOfDays = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		
		return numberOfDays * 10L;
	}

    public static Date GetEventTimestamp(String rawEventData){
    	
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");
		String [] data = rawEventData.split("\\|");
		Date timestamp = null;
		
		try {
			timestamp = format.parse(data[0]);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return timestamp;
	}
    
    public static Long decreaseScoreByAmount(Date oldDate, Date currentDate ){
    	long diff = currentDate.getTime() - oldDate.getTime();
		int numberOfDays = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		return numberOfDays * 1L;
    }
}
