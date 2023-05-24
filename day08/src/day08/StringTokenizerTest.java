package day08;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = "아이언맨/토르/헐크/스파이더맨/앤트맨/블랙핑크";
		StringTokenizer st = new StringTokenizer(str,"/");
		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		for(int i=0;i<st.countTokens();i++) {
//			System.out.println(st.nextToken());
//		}
		while(st.hasMoreTokens()) {//StringTokenizer 클래스 객체에서 다음에 읽어 들일 token이 있으면 true, 없으면 false를 return한다.
			System.out.println(st.nextToken());
		}
	}
}
