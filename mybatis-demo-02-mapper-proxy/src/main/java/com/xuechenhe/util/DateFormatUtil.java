package com.xuechenhe.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {
	
	public static void main(String[] args) {
		Date date = new Date();
		String dateStr = convertDateToStr(date);
		System.err.println(dateStr);
		
	}

	public static String convertDateToStr(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = null;
		try {
			dateStr = sdf.format(date);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dateStr;
	}

}
