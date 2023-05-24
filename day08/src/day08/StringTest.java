package day08;

public class StringTest {
	public static void main(String[] args) {
		String str01 = new String("Java");		
		String str02 = new String("JavaScript");
		
		System.out.println(str01.length());//글자 갯수를 알려줌
		System.out.println(str02.length());
		System.out.println(str01.contains("Java"));// 입력된 글자를 확인해줌
		System.out.println(str02.contains("Java"));	
	
		System.out.println(str01.concat(str02));// 두개를 연결해줌	
	
		String str03 = "Java,Oracle,Javascript,Jsp,Spring";
		
		String strList[] = str03.split(",");
		
		for(String str : strList) {
			System.out.print(str+"/");
		}
		System.out.println();
		String jumin = "9012121192314";
			System.out.println(jumin.substring(0));// db에서 뽑아쓴다	
			String year = jumin.substring(0, 2);
			String month = jumin.substring(2, 4);
			String date = jumin.substring(4, 6);
			System.out.println(year+"년"+month+"월"+date+"일");
//		System.out.println(strList[1]); //번호를 넣어 원하는 String을 뽑아낸다
		
	}

package day08;

public class StringTest {
	public static void main(String[] args) {
		String str01 = new String("Java");		
		String str02 = new String("JavaScript");
		
		System.out.println(str01.length());//글자 갯수를 알려줌
		System.out.println(str02.length());
		System.out.println(str01.contains("Java"));// 입력된 글자를 확인해줌
		System.out.println(str02.contains("Java"));	
	
		System.out.println(str01.concat(str02));// 두개를 연결해줌	
	
		String str03 = "Java,Oracle,Javascript,Jsp,Spring";
		
		String strList[] = str03.split(",");
		
		for(String str : strList) {
			System.out.print(str+"/");
		}
		System.out.println();
		String jumin = "9012121192314";
			System.out.println(jumin.substring(0));// db에서 뽑아쓴다	
			String year = jumin.substring(0, 2);
			String month = jumin.substring(2, 4);
			String date = jumin.substring(4, 6);
			System.out.println(year+"년"+month+"월"+date+"일");
//		System.out.println(strList[1]); //번호를 넣어 원하는 String을 뽑아낸다
		
	}


}