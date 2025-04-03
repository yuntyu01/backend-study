import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int user_num;
        String comp_str;

        while (true) {
            int comp_num = (int)(Math.random()*3);

            if (comp_num == 0) {
                comp_str = "가위";
            }
            else if (comp_num ==1) {
                comp_str = "바위";
            }
            else {
                comp_str = "보";
            }

            Scanner sc = new Scanner(System.in);  // 입력 객체 생성
            System.out.printf("가위바위보 중에서 입력하세요: ");
            String user_str = sc.nextLine();

            System.out.println(user_str);
            if (user_str.contains("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (user_str.contains("가위")) {
                user_num = 0;
            }
            else if (user_str.contains("바위")) {
                user_num = 1;
            }
            else if (user_str.contains("보")) {
                user_num = 2;
            }
            else {
                System.out.println("입력이 잘못되었습니다. 가위, 바위, 보 중에서 입력해주세요.");
                return;
            }

            System.out.printf("사용자: %s\n", user_str);
            System.out.printf("컴퓨터: %s\n", comp_str);

            if (user_num == comp_num) {
                System.out.println("서로 비겼습니다.\n");
            }
            else if (user_num == 0) {
                if (comp_num == 2) {
                    System.out.println("사용자가 승리했습니다.\n");
                }
                else {
                    System.out.println("컴퓨터가 승리했습니다.\n");
                }
            }
            else {
                if (user_num - comp_num == 1) {
                    System.out.println("사용자가 승리했습니다.\n");
                }
                else {
                    System.out.println("컴퓨터가 승리했습니다.\n");
                }
            }
        }
    }
}
