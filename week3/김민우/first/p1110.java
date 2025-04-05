package 김민우.first;

import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class p1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.close();

        IntUnaryOperator nextNumber = num -> {
            int tens = num / 10;
            int units = num % 10;
            int sum = tens + units;
            return units * 10 + sum % 10;
        };
        int count = 0;
        int current = n;
        do {
            current = nextNumber.applyAsInt(current);
            count++;
        } while (current != n);
        System.out.println(count);
    }
}