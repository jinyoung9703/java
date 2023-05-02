package ch02;

public class Ex06 {
	public static void main(String [] args) {
		// 문자열 연산 ( + )
		// 연결한다 의 의미
		String a = "JDK" + 6.0;
		System.out.println(a);
		String b = a + "특징";
		System.out.println(b);
		String c = "JDK" + 3 + 3.0;
		System.out.println(c);
		String d = 3 + 3.0 +"JDK";
		System.out.println(d);
		
		int e = 100;		// 숫자 100
		String f = "100";	// 문자 100
		System.out.println("변수 e : "+e);
		// int + String : String과 +하면 결과는 무조건 String타입으로 나온다
		
		
	}
}











