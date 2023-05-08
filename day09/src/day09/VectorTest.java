package day09;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();
		vec.add(5);//0
		vec.add(3);//1
		vec.add(1);//2
		
		vec.add(1, 100); //1번에 100을 넣겠다.
		
//		System.out.println(vec.size());
//		System.out.println(vec.get(0));
//		System.out.println(vec.get(0));
		System.out.println(vec.capacity());//사이즈를 바꾼
		for(int i=0;i<vec.size();i++) {
			int num=vec.get(i);
			System.out.print(num+",");
		}
		
		for(int num:vec) {
			System.out.print(num+",");
		}
	}
}