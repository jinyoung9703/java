package qulz;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HowManyWord {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		while (true) {
			System.out.println(">>");
			String str = scanner.nextLine();
			if (str.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			StringTokenizer st = new StringTokenizer(str," ");
			System.out.println("단어의 갯수는 :"+st.countTokens());
		}
	}
package qulz;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HowManyWord {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		while (true) {
			System.out.println(">>");
			String str = scanner.nextLine();
			if (str.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			StringTokenizer st = new StringTokenizer(str," ");
			System.out.println("단어의 갯수는 :"+st.countTokens());
		}
	}
}