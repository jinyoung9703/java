package ch03;

public class ForEx09 {
	public static void main(String[] args) { 	//나머지 연산: 나누고 난 후 남는 값
		//반복문 속 조건문 <-> 조건문 속 반복문			//10%2=0:남는 값 없음
//		for(int a=0; a<=9; a++) {				//10%3=1
//			//for문의 조건식이 true일때 실행.			//10%20=10:나눌수가 없기때문에 10은 나눠지지않고 남아있다.
//			if(a%2 == 0) {
//				//if문의 조건식이 true일때 실행.
//				System.out.println(a+" : 짝수");
//			}else {
//				//if문의 조건식이 false일때 실행.
//				System.out.println(a+" : 홀수");
//			}//if문 종료.
//		}//for문의 종료.
		
//		for(int i=2; i<=9;i++) {
//			for(int y=1;y<=9;y++) {
//				System.out.println(i+"x"+y+"="+(i*y));
//			}
//		}
		for(int m=50;m>=0;m--) {	
			if(m%2 == 0) {
				
				System.out.println("▼짝 : "+m +"  : ▼짝");
			}else {
			
				System.out.println("▲홀 : "+m+"  : ▲홀");
			}
		
			}
		for(int y=1;y<=50;y++) {
			if(y%2 == 0) {
				
				System.out.println("▼짝 : "+y+"  : ▼짝");
			}else {
			
				System.out.println("▲홀 : "+y+"  : ▲홀");
			}
		}
	
	}
}
