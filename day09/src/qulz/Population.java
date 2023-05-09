<<<<<<< HEAD
package qulz;
//3.한국은 5000 미국 25000 중국 100000 인도 120000 일본 15000
import java.util.HashMap;
import java.util.Scanner;

public class Population {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<>();
		nations.put("한국", 5000);
		nations.put("미국", 25000);
		nations.put("중국", 100000);
		nations.put("인도", 120000);
		nations.put("일본", 15000);
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// exit쓰면 빠져나가게 만들기
			System.out.println("나라를 입력하면 인구수를 알려드립니다.exit를 입력하면 빠져 나갑니다.");
			String nation = scanner.next();
			if (nation.equals("exit"))
				break;
			Integer population = nations.get(nation);
			if (population == null)
				System.out.println("없는 나라입니다.");
			// System.out.println(nation+":"+population);
			System.out.println(nation + "인구는 " + population + "만명 입니다.");
		}
	}
}
=======
package qulz;
//3.한국은 5000 미국 25000 중국 100000 인도 120000 일본 15000
import java.util.HashMap;
import java.util.Scanner;

public class Population {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<>();
		nations.put("한국", 5000);
		nations.put("미국", 25000);
		nations.put("중국", 100000);
		nations.put("인도", 120000);
		nations.put("일본", 15000);
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// exit쓰면 빠져나가게 만들기
			System.out.println("나라를 입력하면 인구수를 알려드립니다.exit를 입력하면 빠져 나갑니다.");
			String nation = scanner.next();
			if (nation.equals("exit"))
				break;
			Integer population = nations.get(nation);
			if (population == null)
				System.out.println("없는 나라입니다.");
			// System.out.println(nation+":"+population);
			System.out.println(nation + "인구는 " + population + "만명 입니다.");
		}
	}
}
>>>>>>> d5872b956ceaa1f3765a9b2c4a998bd09ad4e7b4
