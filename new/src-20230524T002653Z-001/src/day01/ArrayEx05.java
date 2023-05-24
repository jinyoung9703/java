package day01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayEx05 {
	public static void main(String[] args) {
		// 정렬,교집합,검색(있는지 없는지)
		ArrayList<Integer> list1 = new ArrayList();
		ArrayList<Integer> list2 = new ArrayList();	
		
		list1.add(50);
		list1.add(30);
		list1.add(10);
		list1.add(20);

		//sort()	:정렬하는 메서드
		Collections.sort(list1);	//정렬
		System.out.println(list1);
	}	
}
