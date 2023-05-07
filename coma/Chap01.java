package coma;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Chap01 {
	public static void main(String[] args) {
		
		
		Calendar now = Calendar.getInstance();
		
		int year =now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_WEEK);
		int date = now.get(Calendar.DAY_OF_MONTH);
		
		int hourofDay= now.get(Calendar.HOUR_OF_DAY);
		int hour = now.get(Calendar.HOUR);
		int ampm= now.get(Calendar.AM_PM);
		
		int min=now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		
		System.out.println(ampm==0?"오전":"오후"+"==="+hour+"==="+hourofDay+"==="+min+"==="+sec);
		
		System.out.println(day);
		System.out.println(date);
		System.out.println(now.getTime());
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd - HH:MM:ss");
		System.out.println(dateFormat.format(now.getTime()));
		
		String monthArray[]=
			{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String dayArray[]= 
			{"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		
		System.out.println(year+"/"+monthArray[month]+"/"+date+"/"+dayArray[day-1]);
		
		
		
	}
}
