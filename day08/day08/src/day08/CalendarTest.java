package day08;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		
		
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_WEEK);//요일 
		int date = now.get(Calendar.DAY_OF_MONTH);//날짜
		
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);//0~24시간
		int hour = now.get(Calendar.HOUR);//0~12시간
		int ampm = now.get(Calendar.AM_PM);//오전~오후
		
		int min = now.get(Calendar.MINUTE);//분
		int sec = now.get(Calendar.SECOND);//초
		
		System.out.println(ampm==0?"오전":"오후"+"==="+hour+"==="+hourOfDay+"==="+min+"==="+sec);//오전~오후/0~12,0~24/분/초
		
		System.out.println(day);	//1,2,3,4,5,6,7
		System.out.println(date);
		System.out.println(now.getTime());
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd - HH:MM:ss");
		System.out.println(dateFormat.format(now.getTime()));
		
		String monthArray[]= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String dayArray[]= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		
		System.out.println(year+"/"+monthArray[month]+"/"+date+"/"+dayArray[day-1]);
	}
}