package ch03;

public class WhileEx05 {
	public static void main(String[]args) {
		int z = 0;	
		while(z<=99) {		//1~100 출력
			z++;
			System.out.println(z);
		}
			System.out.println("-------------");
		
	
		int a = 1;			
		while(a<100) {		//홀수 출력
			System.out.println(a);
			a+=2;			
		
		}

		System.out.println("-------------");	
		int y = 0;			
		while(y<=100) {		//짝수 출력
			
			System.out.println(y);
			y+=2;		
		}
	
	}
}
