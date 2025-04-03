import java.util.*;

public class q01 {
    public static void main(String[] args) {
        Scanner sc;
        while(true) {
            sc = new Scanner(System.in);
            System.out.println("0.가위 1.바위 2.보 3.종료");
            int player = sc.nextInt();
    
            int com = (int)(Math.random()*3);
    
            if(player == 3) {
                break;
            }
    
            if(player == com) {
                System.out.println ("비겼습니다");
            } else if((player == 0 && com == 2) || (player == 1 && com == 0) || (player == 2 && com == 1)) {
                System.out.println("승리");
            } else {
                System.out.println("패배");
            }
        }
        sc.close();
    }
}