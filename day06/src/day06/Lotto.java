package day06;

import java.util.Arrays;

public class Lotto {
	public Lotto() {
		
	}
	public Lotto(int many) {
		howMany(many);
	}
	public void howMany(int many) {
		for(int i=0;i<many;i++) {
			makeLotto();			
		}
	}
	
	private void makeLotto() { // private
		int lotto[] = new int[6]; 
		
		for (int i = 0; i < lotto.length; i++) {// length는 배열을 탐색?하는 역활
					lotto[i] = (int) (Math.random() * 45); // ()먼저 계산해서 정수로 바꿔줘라
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		for (int j = 0; j < lotto.length; j++) {
			System.out.print(lotto[j] + ",");
		}
		System.out.println();
	}
}
