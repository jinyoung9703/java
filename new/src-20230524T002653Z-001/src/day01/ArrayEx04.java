package day01;

import java.util.ArrayList;

public class ArrayEx04 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//1~10까지 대입 출력
		for(int i=0; i <=10; i++) {
			list.add(i);
			System.out.println(list.get(i));
		}
	}
}