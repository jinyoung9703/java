package ch03;

public class WhileEx04 {
	public static void main (String[] args) {
		int sum = 0;
		int i = 1;			//초기식
		while(i<=5) {		//조건식	1~5
			sum+=i;
			i++;			//증감식
		}
		System.out.println(sum);
		System.out.println("----------");
		
		int sum1 = 0;
		int y = 1;		//초기식
		while(y<=100) {		// 1~100 
			sum1+=y;	//증감식
			y++;
		}
		System.out.println(sum1);
		System.out.println("----------");
	}
}