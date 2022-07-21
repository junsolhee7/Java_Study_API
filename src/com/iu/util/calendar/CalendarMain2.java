package com.iu.util.calendar;

import java.sql.Date;
import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); 
		
		Calendar birth = Calendar.getInstance();//연월일입력, 
		birth.set(Calendar.YEAR,1998);
		birth.set(Calendar.MONTH,6);
		birth.set(Calendar.DAY_OF_MONTH,9);
//		future.set(Calendar.MINUTE, 15);
//		
//		long n = now.getTimeInMillis();
//		long f = future.getTimeInMillis();
		long n = now.getTimeInMillis();
		long b = birth.getTimeInMillis();
		
//		long result = f-n;
//		System.out.println(result/1000/60);
		long result = n-b;
		System.out.println(result/1000/60/60/24+"일");
		
//		Date date = now.getTime(); //오류?


	}

}
