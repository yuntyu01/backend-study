package 김민우;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
길이가 5인 정수 배열을 선언하고, 사용자로부터 5개의 정수를 입력받아 저장한 뒤, 배열의 모든 요소를 더한 값을 출력하는 프로그램 작성
 */
public class problem2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 5번, 엔터와 함께 입력하세요.");

        int i = 0;
        while (i < arr.length) {
            try {
                System.out.print((i+1) + "번째 정수: ");
                arr[i] = scanner.nextInt();
                i++;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("정수만 입력해주세요.");
            }
        }

        int result = 0;
        for (int k : arr) result += k;
        System.out.println("정수 5개의 합: " + result);
    }
}