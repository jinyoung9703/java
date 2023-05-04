package qulz;
//2.현재 시간을 출력하는데 15시15분
//6~11시부터 goodmoring
//12~17시부터 goodafternoon
//18~21 goodevening
//22~ good night

import java.util.Calendar;

public class CalendarTest {//추상이여서 new생성안됨
	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int min = now.get(Calendar.MINUTE);
		System.out.println(hourOfDay+":"+min);
		if(hourOfDay>=6&&hourOfDay<11) {
			System.out.println("Good Morning");
		} else if (hourOfDay>=11&&hourOfDay<18) {
			System.out.println("good Afternoon");
		} else if (hourOfDay>=18&&hourOfDay<22) {
			System.out.println("good Evening");
		}else {
			System.out.println("good Night");
		}
		
		
		
//		Calendar now = Calendar.getInstance();
//		int hour = now.get(Calendar.HOUR);
//		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
//		int min = now.get(Calendar.MINUTE);// 분
//
//		int age = now.get(Calendar.HOUR_OF_DAY);
//		if (age <= 6) {
//			System.out.println("goodmoring.");
//		} else if(age <= 11){
//			System.out.println("goodmoring");
//			
//		}
//		else {
//			System.out.println("good night");
//
//			System.out.println(hourOfDay + "시" + min + "분");
//		}
//	}
	}
}