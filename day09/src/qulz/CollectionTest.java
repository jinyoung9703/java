package qulz;
//-1이 입력될때까지 숫자를 입력받아서 제일 큰 숫자 출력해보기....
//가변형 collection

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionTest {
	public static void main(String[] args) {
		HashMap<String, Integer> arg = new HashMap<>();
		arg.put("1",80);
		arg.put("2",280);
		arg.put("3",380);
		arg.put("4",480);
		arg.put("5",68);
		arg.put("6",250);
		arg.put("7",350);
		arg.put("-1",45);
		Scanner scanner = new Scanner(System.in);
		
		Set<String> KeyList = arg.keySet();
		Iterator<String> it = KeyList.iterator();
		while (it.hasNext()) {
			String eng = scanner.next();
			System.out.println("숫자입력");
			String name = it.next();
			int num = arg.get(name);
			System.out.println(name+":"+num);
			if(arg==null) System.out.println("가장큰수.");
			else System.out.println(arg);
			}
		}
	}


package qulz;
//-1이 입력될때까지 숫자를 입력받아서 제일 큰 숫자 출력해보기....
//가변형 collection

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionTest {
	public static void main(String[] args) {
		HashMap<String, Integer> arg = new HashMap<>();
		arg.put("1",80);
		arg.put("2",280);
		arg.put("3",380);
		arg.put("4",480);
		arg.put("5",68);
		arg.put("6",250);
		arg.put("7",350);
		arg.put("-1",45);
		Scanner scanner = new Scanner(System.in);
		
		Set<String> KeyList = arg.keySet();
		Iterator<String> it = KeyList.iterator();
		while (it.hasNext()) {
			String eng = scanner.next();
			System.out.println("숫자입력");
			String name = it.next();
			int num = arg.get(name);
			System.out.println(name+":"+num);
			if(arg==null) System.out.println("가장큰수.");
			else System.out.println(arg);
			}
		}
	}
