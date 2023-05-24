package coma;

import java.util.Scanner;

	
	class Player{
		private String name;
		private Scanner scanner = new Scanner(System.in);
	
		public Player(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
			
		public int turn() {
			System.out.println(name + "[가위(1)] [바위(2)] [보(3)] [끝내기(4)]");
			return scanner.nextInt();
		}
		
		}
	
	class Computer extends Player{
		public Computer(String name) {
			super(name);
		}
	
	public int turn() { // Math.random은 1이하의 실수
		return (int) (Math.random() * 3) + 1; // 그러므로 4까지 출력하려면 *3, +1
	}
}

public class RockPaperScissors {
	public static void main(String[] args) {
		String rockPaperScissors[] = { "가위", "바위", "보" };

		Player player = new Player("진영"); // 이름 짓기
		Computer computer = new Computer("슈퍼컴퓨터"); // 이름 짓기
		while (true) {
			int playerChoice = player.turn(); // 플레이어가 입력한 숫자를 출력
			System.out.println(player.getName() + " : " + rockPaperScissors[playerChoice - 1]);
			
			if (playerChoice == 4)
				break;

			int computerChoice = computer.turn(); // 컴퓨터가 입력한 숫자를 출력
			System.out.println(computer.getName() + " : " + rockPaperScissors[computerChoice - 1]);

			if (playerChoice == computerChoice) {
				System.out.println("비겼습니다.");
			} else if (playerChoice == 1 && computerChoice == 3) {
				System.out.println("이겼습니다.");
			} else if (playerChoice == 2 && computerChoice == 1) {
				System.out.println("이겼습니다.");
			} else if (playerChoice == 3 && computerChoice == 2) {
				System.out.println("이겼습니다.");
			} else if (playerChoice == 4 && computerChoice == 0) {
				System.out.println("끝.");
			} else {
				System.out.println("졌습니다.");
			}
		}
	}
}


