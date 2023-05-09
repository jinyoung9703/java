package qulz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Score {
	public static void main(String[] args) {
		HashMap<String, Integer> score = new HashMap<>();
		score.put("1수학", 3);
		score.put("2국어", 3);
		score.put("3사회", 4);
		score.put("4과학", 3);
		score.put("5영어", 3);
		score.put("6미술", 2);
		score.put("7체육", 4);
		System.out.println("과목의 평점 내보기");
		
		
		Set<String> KeyList = score.keySet();// 전체 출력
		Iterator<String> it = KeyList.iterator();// 반복자
		while (it.hasNext()) {
			String name = it.next();
			int num = score.get(name);
		}
		int score1 = score.get(0);
		for(int i=0;i<score.size();i++);
			
		
	}
}