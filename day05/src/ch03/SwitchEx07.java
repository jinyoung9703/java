package ch03;

public class SwitchEx07 {
	public static void main(String[] args) {
//		int score ;
//		String grade = "B";
//		switch(grade) {
//			case "A":
//				score=100;
//			case "B":
//				score=80;
//				break;
//			default:
//				score=60;
//		}
//		System.out.println("scroe는 :" +score);
//	}														//초기화를 한거랑 안한거
		int score =90;	
		String grade;
		switch(score) {
			case 100:	//등급의 초기값 100대입해서 A가나옴
				grade="A";
			break;
			case 80:
				grade="B";
			default:	//초기값이 없을시 디폴트가 나온다
				grade="C";
			//브레이크가 없어서 최후의 값이나온다 
			case 60:
				grade="D";
		}
		System.out.println("grade는 :" +grade);
	}
}