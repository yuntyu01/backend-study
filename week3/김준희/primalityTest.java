import java.util.Scanner;

public class primalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 입력 객체 생성

        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();  // 정수 입력 받기
        
        int sum = 0;

        for (int prime = 1; prime < num; prime++) {
            if (num % prime == 0) {
                sum += prime;
            }
        }

        if (sum == 1) {
            System.out.println("소수입니다.");
        }
        else {
            System.out.println("소수가 아닙니다.");
        }
    }
}