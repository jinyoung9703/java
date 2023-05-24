package day01;

import java.util.ArrayList;
import java.util.Date;

public class ArrayEx03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Date d = new Date();
		
		list.add("hello");
		list.add(100);
		list.add(d);
		
		System.out.println(list);
		
//		String s = list.get(0); 타입 맞지않음
		
		Object obj = list.get(0);	// list안에 어떤 타입이 있는지 모를때 object에 대입함
		System.out.println(obj);
		
		list.add(0,100);
		System.out.println(list);
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("world");
		String s = list2.get(0);	//<String>타입 지정해줬기 때문에 오류 안남.
		System.out.println(s);
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(100);
		int a=list3.get(0);
		System.out.println(a);
		
	
	}
}