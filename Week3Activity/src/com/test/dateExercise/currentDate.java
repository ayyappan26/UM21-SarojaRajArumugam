package com.test.dateExercise;

import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;



/**
 * Write a program to display the current system date in the following formats.
•	Tue Nov 04 20:14:11 EST 2003
•	 11/4/03 8:14 PM
•	8:14:11 PM
•	Nov 4, 2003 8:14:11 PM
•	8:14 PM
•	8:14:11 PM
•	8:14:11 PM EST
•	11/4/03 8:14 PM
•	Nov 4, 2003 8:14 PM
•	November 4, 2003 8:14:11 PM EST

 *
 */
public class currentDate {
	public static void main(String[] args) {
		Date myDate = new Date();
		Date date = Calendar.getInstance().getTime();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		String sDate = sdf.format(myDate);
		System.out.println(sDate);
		
		sdf=new SimpleDateFormat("hh.mm aa");
		sDate = sdf.format(myDate);
		System.out.println(sDate);
		
		sdf=new SimpleDateFormat("hh:mm:ss aa");
		sDate = sdf.format(myDate);
		System.out.println(sDate);
		
		sdf=new SimpleDateFormat("hh:mm:ss aa zz");
		sDate = sdf.format(myDate);
		System.out.println(sDate);
		
		sdf=new SimpleDateFormat("MMM dd, yyyy hh:mm aa");
		sDate = sdf.format(myDate);
		System.out.println(sDate);
		
		sdf=new SimpleDateFormat("MMMM dd, yyyy hh:mm:ss aa zz");
		//sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		sDate = sdf.format(myDate);
		System.out.println(sDate);
		
		
	}
}
