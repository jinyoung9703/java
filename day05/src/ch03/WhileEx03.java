package ch03;

public class WhileEx03 {
	public static void main(String[]args) {
		
		int dan,num;
		for( dan=2; dan<10; dan++) {
			for(num=1;num<=9;num++) {
				System.out.println(dan+"x"+num+"="+(dan*num));
			}
		}
		System.out.println("---------------------");
		//while문으로 구구단
		int a=2;
		while(a<=9) {
			int b=1; //초기식의 위치는 반드시 조건식의 위에! *만약* b가 위에 선언했을때 b가 10이되버려서 조건을 실행못함
			while(b<=9) {
				System.out.println(a+"x"+b+"="+(a*b));
				b++;
			}
			a++;
		}
	}
}