package ch03;

public class DoWhileEx01 {
	public static void main(String[]args) {	
		//While문
		int a =0;
		while(a<3 ) {
			a++;
			System.out.println("hello");
			
		}
		System.out.println("-------------------");
		//do-while문
		// DoWhile문은 While문을 뒤집은거
		// 무조건 한번은 실행한다 -> 조건이 false여도 실행.
		int b=0;
		do {
			System.out.println("hihihihi");
			b++;
		}while(b<3);
		
		
	}
}