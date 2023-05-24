package qulz;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] options = {"가위", "바위", "보"};

        Random random = new Random();
        int computer = random.nextInt(3);

        Scanner scanner = new Scanner(System.in);
        System.out.print("가위, 바위, 보 중 하나를 선택하세요: ");
        String input = scanner.next();

        int player;
        switch (input) {
            case "가위":
                player = 0;
                break;
            case "바위":
                player = 1;
                break;
            case "보":
                player = 2;
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                return;
        }

        System.out.println("플레이어: " + options[player]);
        System.out.println("컴퓨터: " + options[computer]);

        if ((player == 0 && computer == 2) || (player == 1 && computer == 0) || (player == 2 && computer == 1)) {
            System.out.println("플레이어 승리!");
        } else if ((player == 2 && computer == 0) || (player == 0 && computer == 1) || (player == 1 && computer == 2)) {
            System.out.println("컴퓨터 승리!");
        } else {
            System.out.println("비겼습니다!");
        }
    }
}