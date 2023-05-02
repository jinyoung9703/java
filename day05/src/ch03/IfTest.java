package ch03;

public class IfTest {
	public static void main(String[] args) {
		//1번
		int score = 93;
		if(score>=90) {
			System.out.println("점수는 "+score+ "점입니다.");
			System.out.println("학점은 A입니다.");
		}else if(score >= 80) {
			System.out.println("점수는 "+score+ "점입니다.");
			System.out.println("학점은 B입니다.");
		}else if(score >= 70) {
			System.out.println("점수는 "+score+ "점입니다.");
			System.out.println("학점은 C입니다.");
		}else if(score >= 60) {
			System.out.println("점수는 "+score+ "점입니다.");
			System.out.println("학점은 D입니다.");
		}else {
			System.out.println("점수는 "+score+ "점입니다.");
			System.out.println("학점은 F입니다.");
		}
	}

}
