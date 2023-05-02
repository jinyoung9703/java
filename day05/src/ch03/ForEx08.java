package ch03;

public class ForEx08 {
	public static void main(String[]args) {
		//for문 속 for문 2개
//		int a;
//		for(a=1; a<=5; a++) {
//			for(int x=1; x<=5; x++) {
//				System.out.println(a+"//"+x);
//			}	//x의 종료
//			for(int y=1;y<=5;y++) {
//				System.out.println(a+" hello");
//			}	//y의 종료
//		}	//a의 종료
//			int b;
//			for(b=1;b<=5;b++) {
//				for(int x=1; x<=5; x++) {//사용영역이 다르기 때문에 변수x 사용가능
//				System.out.println(b+"//"+x);	
//				}
//				for(int x=1; x<=5;x++) {
//				System.out.println(b+"--"+x); 로컬변수
//				}
	//		}
			int c,x;		//타입이 같기때문에 한번에 선언가능
			for(c=1;c<=5;c++) {
				for(x=1;x<=5;x++) {//사용영역이 다르기 때문에 변수x 사용가능
					System.out.println(c+"||"+x);
				}
				for(x=1;x<=5;x++) {
					System.out.println(c+"__"+x);
				}
			}
	}
}
