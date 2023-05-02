package day05;

import java.util.Scanner;
// 대부분의 프로그래밍 언어들의 변수 scope는 block안에서 유효하다.
// 특정언어들은 function scope를 가지기도 한다.
public class ScoreArray {
	int num = 100; //전역 변수 어디서든 사용할수있다 
	public static void main(String[] args) { 
		String course [] = {"java","html","javascript","spring","oracle"};
		int score[]= {90,95,88,92,78};//지역변수 블럭안에서만 사용
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("과목이름을 입력해주세요.점수를 알려드립니다.");
			String courseName = scanner.next(); //입력
			if(courseName.equals("exit")) break;
			int i=0;
			for(i=0;i<score.length;i++) {
				if(course[i].equals(courseName)) {// equals 객체끼리 비교
					System.out.println(courseName+"의 점수는"+score[i]+"입니다.");
					break;
				}
			}
			//System.out.println(i);//없는 과목 처리 
			if(i==score.length) System.out.println("없는 과목입니다. 다시 입력해 주세여.");
		}
		System.out.println("끝났음.");//exit 치면 나옴
	}
	public void test() {
		System.out.println(num);//전역
	}
}