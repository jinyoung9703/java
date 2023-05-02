package ch01;

public class Ex02 {	// 클래스 선언, 클래스이름 == 소스파일의 이름
	public static void main(String[] args) {
		// 변수
		// 데이터타입 이름;	선언
		// 이름 = 값;		대입(값의 저장)
		int a;
		a = 10;
//		System.out.println(a);
/*
 * 
 * 		변수의 초기화 : 변수에 최초의 값을 넣어주는것
 * 		변수 이름 : 소문자,
 * 				  어떤것을 사용할지 유추 가능한 이름 사용.
 * 				  int age; String name;
 * 		=	: 대입 - 오른쪽에 있는 값을 왼쪽에 대입한다.
		변수를 사용한다는건 변수 안에있는 값을 사용한다는것.
		변수는 하나의 값만을 저장하는 저장소
		대입이 가능 -> 제일 마지막에 대입된 값이 남는다.
		갯수 상관없이 선언 가능
		이름의 길이 상관 없음.
 * 		
 */
		a = 20;
		System.out.println(a);
		int b = 30;		// 선언과 대입 한번에 가능함.
		System.out.println(b);
		
		int c = b;		// 같은 타입끼리 대입 가능
		System.out.println(c); // 값의 복사, b가 사라지는것이 아님.
		
		int d = 
				c + a;	// ; 이 있어야 하나의 실행문 의미.
		System.out.println(d);
 				
	}//main영역
}// class영역






