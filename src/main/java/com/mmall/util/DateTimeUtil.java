package com.mmall.util;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeUtil {
	
	public static final String STANDARD_FORMAT ="yyyy-mm-dd HH:mm:ss";
		
	//str->date
	public static Date strToDate(String dataTimeStr, String formatStr){
		DateTimeFormatter dateTimeFormatter=DateTimeFormat.forPattern(formatStr);
		DateTime dateTime=dateTimeFormatter.parseDateTime(dataTimeStr);
		return dateTime.toDate();
	}
	
	//date->str
	public static String dateToStr(Date date, String formatStr){
		if(date==null){
			return StringUtils.EMPTY;
		}
		DateTime dateTime=new DateTime(date);
		return dateTime.toString(formatStr);
	}
	
	public static Date strToDate(String dataTimeStr){
		DateTimeFormatter dateTimeFormatter=DateTimeFormat.forPattern(STANDARD_FORMAT);
		DateTime dateTime=dateTimeFormatter.parseDateTime(dataTimeStr);
		return dateTime.toDate();
	}
	
	//date->str
	public static String dateToStr(Date date){
		if(date==null){
			return StringUtils.EMPTY;
		}
		DateTime dateTime=new DateTime(date);
		return dateTime.toString(STANDARD_FORMAT);
	}

}
