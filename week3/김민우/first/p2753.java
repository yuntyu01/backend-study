package 김민우.first;

import java.util.Scanner;
import java.util.function.Predicate;

public class p2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        Predicate<Integer> isDivisibleBy4 = y -> y % 4 == 0;
        Predicate<Integer> isDivisibleBy100 = y -> y % 100 == 0;
        Predicate<Integer> isDivisibleBy400 = y -> y % 400 == 0;

        Predicate<Integer> isLeapYear = y ->
                isDivisibleBy4.test(y) && (!isDivisibleBy100.test(y) || isDivisibleBy400.test(y));

        System.out.println(isLeapYear.test(year) ? 1 : 0);

        scanner.close();
    }
}