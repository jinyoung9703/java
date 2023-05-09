<<<<<<< HEAD
package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScore {
	public static void main(String[] args) {
		HashMap<String,Integer> score = new HashMap<>();
		score.put("정진영", 85);
		score.put("안현우", 88);
		score.put("장은진", 90);
		score.put("최수민", 95);
		score.put("박태은", 92);
		score.put("박태은", 111);//set은 중복허용하지 않는다 키값이 같으면 하나만 출력 (마지막값)
		

		Set<String> KeyList = score.keySet();// 전체 출력
		Iterator<String> it = KeyList.iterator();// 반복자
		while (it.hasNext()) {
			String name = it.next();
			int num = score.get(name);
			System.out.println(name+":"+num);
		}
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
	}
=======
package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScore {
	public static void main(String[] args) {
		HashMap<String,Integer> score = new HashMap<>();
		score.put("정진영", 85);
		score.put("안현우", 88);
		score.put("장은진", 90);
		score.put("최수민", 95);
		score.put("박태은", 92);
		score.put("박태은", 111);//set은 중복허용하지 않는다 키값이 같으면 하나만 출력 (마지막값)
		

		Set<String> KeyList = score.keySet();// 전체 출력
		Iterator<String> it = KeyList.iterator();// 반복자
		while (it.hasNext()) {
			String name = it.next();
			int num = score.get(name);
			System.out.println(name+":"+num);
		}
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
	}
>>>>>>> d5872b956ceaa1f3765a9b2c4a998bd09ad4e7b4
}