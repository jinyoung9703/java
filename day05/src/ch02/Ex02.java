package ch02;

public class Ex02 {
	public static void main(String[] args) {
		// 증감연산자 위치와 순서
		// 변수 앞 (선증가 1순위) / 변수 뒤 (후증가 마지막순위)
		int a = 10;					// 주석으로 값을 써보세요
//		System.out.println(a++);	// 출 , 연 10 , 11
//		System.out.println(++a);	// 연 , 출 12 , 12
//		System.out.println(a++);	// 출 , 연 12 , 13
//		System.out.println(a++);	// 출 , 연 13 , 14
//		System.out.println(++a);	// 연 , 출 15 , 15
//							a++;	// 1증가		   16
//		System.out.println(++a);	// 연 , 출 17 , 17
//		System.out.println(a);		// 17
		
		// 감소(--)도 마찬가지
		System.out.println(a--);	// 10, 9
		System.out.println(--a);	// 8 , 8
		System.out.println(a--);	// 8 , 7
		System.out.println(a--);	// 7 , 6
		System.out.println(--a);	// 5 , 5
							a--;	// 	   4
		System.out.println(--a);	// 3 , 3
		System.out.println(a);		// 3
	}

}
