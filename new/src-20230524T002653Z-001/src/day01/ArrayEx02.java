package day01;

import java.util.ArrayList;

public class ArrayEx02 {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();		// 기본 생성자
//		ArrayList list2 = new ArrayList(20);	// 매개변수 int인 생성자
												// 크기 설정. 넣는대로 데이터가 들어가기때문에 상관없다.
		
//		System.out.println(list1.size());
//		System.out.println(list2.size());
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
//		System.out.println(list1);
		
		ArrayList list2 = new ArrayList(list1);	// list1의 값 복사해서 생성
		System.out.println(list2);
		System.out.println(list1);
	
	}
}