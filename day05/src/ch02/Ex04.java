package ch02;

public class Ex04 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		// 출력, 증감, 덧셈
		// 순서 : 증감 덧셈 출력
//		System.out.println(++a + b);	// 11 + 10
//		System.out.println(++a + ++b);	// 11 + 11
		
		// 후증가이기 때문에 가운데 덧셈이 먼저 일어난다.
//		System.out.println(a++ + b++);	// 10 + 10
		
		// 증감 , 덧셈 , 출력
//		System.out.println(++a + ++a);	// 11 + 12
		
		System.out.println(a++ + a++);	// 10 +	11 
		System.out.println(a);
		// 하나의 변수에는 연산자 하나만 대기할수 있다. 
		// 앞에있는 증가연산이 먼저 실행
	}
}








