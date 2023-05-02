package day05;

public class Array02 {
	public static void main(String[] args) {

		
		int nums[] = {1,3,5,7,9,10,12,19,900,40};// 배열은 중요하다.
		int total = nums.length;
		System.out.println(total);
		
		String fruits[] = new String[5];
		fruits[0]="포도0";
		fruits[1]="포도1";
		fruits[2]="포도2";
		fruits[3]="포도3";
		fruits[4]="포도4";
		
		for(int i=0; i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		
		System.out.println(fruits[4]);
		
		String animals[] = {"강아지","고양이","사자","호랑이"};
		for(int i=0;i<animals.length;i++) {
			System.out.println(animals[i]);
		}
		System.out.println("--------");
		for(String animal : animals) {
			System.out.println(animal);
		}
		//3,4,5,6,7,8,14,37,64,87,90
		int nums02[] = {23,45,67,78,56,3,9,12,85,889889};
		
		for(int z=0;z<nums02.length;z++) {
			if(nums02[z]%3 == 0)
				System.out.print(nums02[z]+" ");
		}
		System.out.println();
		for(int num : nums02) {
			if(num %3 == 0)
				System.out.print(num+" ");
		}
	}
}
	
		
//		System.out.println(nums.length);//길이의 개수를 알 수 있다
//		int total = nums.length;
//		int sum = 0;
//		for(int i=0;i<total;i++) {
//			sum+=nums[i];
//		}
//		System.out.println(sum);
//		System.out.println((double)sum/total);
//		
//		//for-each 간략화 정답은 없고 얼마나 더 쉽게
//		int sum02 =0;
//		for(int j:nums) {
//			sum02+=j;
//		}
//		System.out.println(sum02);
//		
//		String fruits[] = {"딸끼","사과","복숭아","키위"};
//		for(String fruit:fruits) {
//			System.out.print(fruit+",");
//		}//다시해봐
//		int intArray[][]=new int [2][3];
//		intArray[0][0] = 1;
//		intArray[0][1] = 2;
//		intArray[0][2] = 3;
//		
//		intArray[1][0] = 100;
//		intArray[1][1] = 200;
//		intArray[1][2] = 300;
//		
////		intArray[2][0] = 100;
////		intArray[2][1] = 700;
////		intArray[2][2] = 900;
//		
//		for(int i=0;i<intArray.length;i++) {
//			for(int j=0;j<intArray[i].length;j++) {
//				System.out.println(intArray[i][j]+",");
//			}
//		}
		//System.out.println(intArray[1][2]);