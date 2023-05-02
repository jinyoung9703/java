package ch03;

public class IfEx05 {
	public static void main(String[] args) {
		int a = 6;
		if( a>100 ) {
			System.out.println("if true");
		}else if( a>50 ) {				// 여러개 사용 가능.
			System.out.println("else if true");
		}else if( a>20 ){
			System.out.println("else if2 true");
		}else if( a>0 ){
			System.out.println("else if3 true");
		}else {							// 필수아님 선택 . 문법상 가장 마지막에 위치해야함.
			System.out.println("else true");
		}
	}
}