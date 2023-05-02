package ch03;

public class ForEx07 {
	public static void main(String[] args) {
		//for문 속 for문
		int a;
		int b;
	
		for(a=1; a<=5;a++) {
			for(b=1; b<=5; b++) {
				System.out.println(a+"/ /"+b);
			}
		}
		//구구단
		int dan,num;
		for(dan=2; dan<=9;dan++) {		//2단~9단
			for(num=1; num<=9; num++) { //1~9
				System.out.println(dan+"단:"+dan+"x"+num+"="+(dan*num));
			}													//()수학에 연산 우선순위가 가장높다.
		}
	}
}