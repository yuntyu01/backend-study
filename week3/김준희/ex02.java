public class ex02 {
    public static void main(String[] args) {
        for (int i=1; i<4; i++) {
            for (int j=3*i-2; j<=3*i; j++) {
                System.out.printf("%d단 ", j);
            }
            System.out.print(" ");
            for (int j=i; j<=i+2; j++) {
                System.out.printf("%d단 ", 3 * j - 2 * i);
            }
            System.out.println();
        }
    }
}
