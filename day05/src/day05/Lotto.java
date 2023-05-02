package day05;

import java.util.Arrays;
import java.util.Collections;

public class Lotto {//배열은 연속적이여서 반복문쓰기 편함
	public static void main(String[] args) {
		for (int k = 0; k < 5; k++) {
			int lotto[] = new int[6]; // 6개의 정수를 담을 그릇 (공간확보)
			System.out.print("로또번호" + (k + 1) + " : ");

			for (int i = 0; i < lotto.length; i++) {// length는 배열을 탐색?하는 역활
				// static 클래스
				lotto[i] = (int) (Math.random() * 45); // ()먼저 계산해서 정수로 바꿔줘라
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			// filtering / sorting
			Arrays.sort(lotto);
			// Arrays.sort(lotto,Collections.reverseOrder());
			for (int j = 0; j < lotto.length; j++) {
				System.out.print(lotto[j] + ",");
			}
			System.out.println();
		}
	}
}
