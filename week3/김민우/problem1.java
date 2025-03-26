package 김민우;

import java.util.Scanner;

/*
- 사용자가 입력하고 <Enter> 키를 치면 컴퓨터는 랜덤하게 가위, 바위, 보 중 하나를 선택하고, 누가 이겼는지를 출력
- "그만"을 입력하면 게임 종료
- 컴퓨터가 내는 것을 랜덤하게 결정하기 위해 다음 코드를 이용하며, 0은 "가위", 1은 "바위", 2는 "보"로 처리한다.
 */
//int n = (int)(Math.random()*3); // 0, 1, 2 중 랜덤 정수 리턴

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"가위", "바위", "보"};

        System.out.println("가위바위보 게임을 시작합니다.");
        System.out.println("가위, 바위, 보 중에서 선택하세요. '그만'을 입력하면 게임이 종료됩니다.");
        while (true) {
            System.out.print("사용자 >> ");
            String userInput = scanner.nextLine();
            if (userInput.equals("그만")) break;
            if (!userInput.equals("가위") && !userInput.equals("바위") && !userInput.equals("보")) {
                System.out.println("가위, 바위, 보 중에서 입력하세요.");
                continue;
            }
            int computerChoice = (int)(Math.random() * 3); // 0, 1, 2 중 랜덤 정수 리턴
            System.out.println("컴퓨터 >> " + choices[computerChoice]);
            System.out.println(determineWinner(userInput, choices[computerChoice]));
        }
        System.out.println("게임을 종료합니다.");
        scanner.close();
    }
    private static String determineWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "비겼습니다.";
        } else if ((user.equals("가위") && computer.equals("보")) ||
                (user.equals("바위") && computer.equals("가위")) ||
                (user.equals("보") && computer.equals("바위"))) {
            return "사용자가 이겼습니다!";
        } else {
            return "컴퓨터가 이겼습니다!";
        }
    }
}