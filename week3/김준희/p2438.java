import java.util.Scanner;

public class p2438 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  // 입력 객체 생성
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("*".repeat(i));
        }

        
    }
}
