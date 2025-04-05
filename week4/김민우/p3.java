package week4.김민우;

public class p3 {
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값:" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값:" + abs(value));
    }
    static int abs(int n) {
        return Math.abs(n);
    }
}
