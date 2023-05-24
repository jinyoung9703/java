package day01;

import java.util.ArrayList;
import java.util.Date;

public class ArrayEx01 {
	public static void main(String[] args) {
		//객체 생성
		ArrayList list = new ArrayList();
		System.out.println(list);
		list.add(100);	//추가하는 메서드
		list.add("hello");
		System.out.println(list);
		
		list.add(100);
		list.add("hello");
		System.out.println(list);//순서유지, 중복 허용
		
		Date d = new Date();
		list.add(d);
		System.out.println(list);//타입 상관없음
		
		list.add(0,77);			// (인덱스 번호,값) : 0번 인덱스에 77을 넣겠다.				add 오버라이딩 
		System.out.println(list);
		
		list.set(0, 700);		// set (인덱스 번호,값) : 수정하는 메서드 : 0번 인덱스 값을 700으로 바꾸겠다.
		System.out.println(list);
		System.out.println(list.size());// size() : 저장된 데이터의 수.
		
		list.remove(0);					//remove() : 지정된 인덱스 값 제거.
		System.out.println(list);
		
		list.clear();					//clear() : 전체 삭제
		System.out.println(list);
		
		
	}
}
