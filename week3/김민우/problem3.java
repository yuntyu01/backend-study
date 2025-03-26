package 김민우;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
만약 0으로 나누는 경우 "Error: Cannot divide by zero!"를 출력하고 프로그램이 종료되지 않도록 예외 처리
 */
public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPossible = true;
        System.out.println("A/B 계산기");
        while (isPossible) {
            try {
                System.out.print("양수(A)를 입력하세요: ");
                int numerator = scanner.nextInt();
                System.out.print("양수(B)를 입력하세요: ");
                int denominator = scanner.nextInt();
                double result = (double)numerator / (double)denominator;
                System.out.println("결과: " + result);
                System.out.print("계속하시겠습니까? (y/n): ");
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("n")){
                    isPossible = false;
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero!");
            } catch (InputMismatchException e) {
                System.out.println("Error: 숫자만 입력해주세요!");
                scanner.nextLine(); // 입력 버퍼 비우기
            }
        }
        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}