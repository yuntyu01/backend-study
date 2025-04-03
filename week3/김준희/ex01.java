public class ex01 {
    public static void main (String[] args) {
        for (int num=2; num <= 500; num++) {
            int sum1 = 0;

            for (int i=1; i<=num-1; i++) {
                sum1 = sum1 + i;
            }
            if (sum1 == (2*num+3)) {
                System.out.println(num);
            }
        }
    }
}
