package ch03;

public class ForEx04 {
	public static void main(String [] args) {
		int i;
		int sum = 0;
		sum = sum +1;	
		sum = sum +2;
		sum = sum +3;
		sum = sum +4;
		sum = sum +5;
		System.out.println("0~5까지의 합:"+sum);

		System.out.println("------------------------");
		
		//0~5까지의 합
		int sum1 =0;//시작값이0
		for( i=1;i<=5;i++) {
			sum1+=i;			//i=1 1=>2=>3=>4=>5까지 대입되고 반복 종료 = 15
		}
		System.out.println("0~5까지의 합:"+sum1);
		
		System.out.println("------------------------");	
		int sum2 =1;// 시작값이1
		for( i=2;i<=5;i++) {//2부터 더해줘도 동일함
			sum2+=i;			
			}
		System.out.println("0~5까지의 합:"+sum2);
		
		System.out.println("------------------------");	
		int sum3 =0;
		for( i=1;i<=100;i++) {
			sum3+=i;			
			}
		System.out.println("1~100까지의 합:"+sum3);		
	}
}