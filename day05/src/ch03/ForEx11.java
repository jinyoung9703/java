package ch03;

public class ForEx11 {
	public static void main(String[] args) {
		//break문 사용.
		for(int a=1; a<=100;a++) {
			if(a%5 == 0) {		//a가 1~5까지 왔을때 true여서 브레이크로빠져나감
				break;
			}
			System.out.println(a);
		}
		System.out.println("hello");
	}
	
}
