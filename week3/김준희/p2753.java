import java.util.Scanner;

public class p2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 입력 객체 생성
<<<<<<< HEAD
        int num = sc.nextInt();
=======
        String num_str = sc.nextLine();
        int num = Integer.parseInt(num_str); //참조형이기 때문에 형변환은 parseInt 사용
>>>>>>> origin/Joon

        if (num % 4 == 0 && (num % 100 != 0 || num % 400 == 0)) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
