package day08;

public class WrapperTest {
	public static void main(String[] args) {
		char ch = Character.toLowerCase('A');	//대문자 소문자 변경하는거
		System.out.println(ch);
		char ch01='a';
		char ch02='4';
		System.out.println(	Character.isDigit(ch01));	//숫자를 확인하는거
		System.out.println(	Character.isDigit(ch02));
		
		System.out.println(	Character.isAlphabetic(ch01));	//character가 문자인지 숫자인지 확인하는거
		System.out.println(	Character.isAlphabetic(ch02));
		
		int age = Integer.parseInt("20");
		if(age>20) {
			System.out.println("술집 출입 가능");
		}else {
			System.out.println("술집 출입 안됨");
		}
		
		int num = 20;
		Integer objNum = num;
		int unboxingNum = objNum+10;
		System.out.println(unboxingNum);
		String str = Integer.toString(unboxingNum);
		System.out.println(str.equals("30")); //equals은 객체끼리 내용을 비교할 수 있다 
	}
package day08;

public class WrapperTest {
	public static void main(String[] args) {
		char ch = Character.toLowerCase('A');	//대문자 소문자 변경하는거
		System.out.println(ch);
		char ch01='a';
		char ch02='4';
		System.out.println(	Character.isDigit(ch01));	//숫자를 확인하는거
		System.out.println(	Character.isDigit(ch02));
		
		System.out.println(	Character.isAlphabetic(ch01));	//character가 문자인지 숫자인지 확인하는거
		System.out.println(	Character.isAlphabetic(ch02));
		
		int age = Integer.parseInt("20");
		if(age>20) {
			System.out.println("술집 출입 가능");
		}else {
			System.out.println("술집 출입 안됨");
		}
		
		int num = 20;
		Integer objNum = num;
		int unboxingNum = objNum+10;
		System.out.println(unboxingNum);
		String str = Integer.toString(unboxingNum);
		System.out.println(str.equals("30")); //equals은 객체끼리 내용을 비교할 수 있다 
	}
}