package 김민우;

import java.util.Scanner;
import java.util.stream.IntStream;

public class p2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        IntStream.rangeClosed(1, n)
                .forEach(i -> {
                    IntStream.rangeClosed(1, i)
                            .forEach(j -> System.out.print("*"));
                    System.out.println();
                });

        scanner.close();
    }
}