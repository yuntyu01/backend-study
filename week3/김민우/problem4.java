package 김민우;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
사용자로부터 숫자 입력을 받아 해당 숫자가 소수인지 판별하는 프로그램 작성
 */
public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("소수 판별기");
        while (true) {
            try {
                System.out.print("판별할 숫자를 입력하세요 (종료하려면 -1 입력): ");
                String input = scanner.nextLine();
                try {
                    // long 범위 : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
                    long number = Long.parseLong(input);
                    if (number < 0) break;
                    if (number <= 1) System.out.println(number + "은(는) 소수가 아닙니다.");
                    else {
                        boolean isPrime = true;
                        for (long i = 2; i <= Math.sqrt(number); i++)
                            if (number % i == 0) {
                                isPrime = false;
                                break;
                            }
                        System.out.println(number + "은(는) " + (isPrime ? "소수입니다." : "소수가 아닙니다."));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("오류: 입력값이 너무 큽니다. -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 범위의 숫자를 입력해주세요.");
                }
            } catch (Exception e) {
                System.out.println("오류: 예상치 못한 오류가 발생했습니다. " + e.getMessage());
                scanner.nextLine(); // 버퍼를 비우지 않으면 동일한 예외 무한 호출
            }
        }
        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}