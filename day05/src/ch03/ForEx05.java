package ch03;

public class ForEx05 {
	public static void main(String[] args) {
		int sum =0;
		int i;
		for( i=1;i<=100;i+=2) {//홀수의합
			sum+=i;			
			}
		System.out.println(sum);
		System.out.println("-------------------");
		int sum1 =0;
		for(i=2;i<=100;i+=2) {//짝수의합
			sum1 +=i;
		}
		System.out.println(sum1);
	}
}
