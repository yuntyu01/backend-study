import java.util.Scanner;

public class p2438 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  // 입력 객체 생성
        String num_str = sc.nextLine();
        int num = Integer.parseInt(num_str); //참조형이기 때문에 형변환은 parseInt 사용
        int count = 1;

        for (int i = 0; i < num; i++) {
            System.out.println("*".repeat(count));
            count += 1;
        }
    }
}
