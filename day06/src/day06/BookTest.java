package day06;

public class BookTest {
	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		a = 100;
		System.out.println(a+"==="+b);
		
		Book littlePrince = new Book("어린왕자","생텍쥐페리");
//		System.out.println(littePrince.author);
//		System.out.println(littePrince.title);
		littlePrince.showInfo();
		
		Book java = new Book("java 코딩");
//		System.out.println(java.author);
//		System.out.println(java.title);
		java.showInfo();
		
		Book untitle = new Book();
		untitle.showInfo();
		
		Book myBook = littlePrince;
		littlePrince.author="san theckjjiberry";
		myBook.author = "장성호";
		
		//바뀌는게 아니고 참고만 한다
		//복사하는게 아니고 참조만 한다.
		
		System.out.println(littlePrince.author);
		System.out.println(myBook.author);
	
		//기본 타입이 아닌 변수들은 참조를 한다. 복사하지 않는다.
		
		
		
		
		int arr01[] = {1,2,3};
		int arr02[] = arr01;
		arr02[1] = 200;
		System.out.println(arr01[1]);
		
		
	}
}