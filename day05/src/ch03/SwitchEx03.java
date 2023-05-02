package ch03;

public class SwitchEx03 {
	public static void main (String[]arsg) {
		int a=10;
		switch(a) {
			case 10:
				System.out.println("10점");
			break;							//break;를 만나면 switch문 빠져나감
											//조건문 반복문 : if문,for,Do-while 사용이 된다.
			case 9:							//case 종료.
				System.out.println("9점");
				break;							//case 마다 사용해도된다.
			case 8:
				System.out.println("8점");
			default:
				System.out.println("0점");
				
		}
	}
}
