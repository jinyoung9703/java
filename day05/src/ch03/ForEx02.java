package ch03;

public class ForEx02 {
	public static void main(String[] args) {
		//for(초기식; 조건식; 증감식){실행코드}
		//실행순서: 초기식 ->조건식->실행코드->증감식->조건식->실행코드->증감식->조건식
		//초기식 : 처음 단 한번만 실행
		//조건식 : 조건식의 결과가 true일때 실행, 몇번 박복하는지 알수있다.
		//증감식 : 증감함. 대입연산자가 사용된다.
		//조건식이 false일때 for문 종료.
		
		for(int a=1; a<=3; a++) {
			System.out.println("안녕하세요");
		}//for문 종료 지점
		//0~5까지 출력하는 코드
		for(int b=0; b<=5; b++) {
			System.out.println(b);
		}
		//1~100까지
		int c=1;
		for(; c<=100; c++) {// 무한 반복을 조심해라 초기값을 for문 밖에 넣어도 된다
			System.out.println(c);
		}
	}
}