package 김민우.second;

import java.util.Arrays;

public class p2 {
    public static void main(String[] args) {
        int[] data = { 3, 2, 9, 4, 7 };
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));
        System.out.println("최대값:" + max(new int[] {}));

    }
    static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -999999;
        }
        return Arrays.stream(arr).max().getAsInt();
    }

    /*
    main에서 내부 클래스나, 내부 메서드를 사용하려면 static 명시해야 함
    1. main메서드 자체가 static이고
    2. JVM이 main을 프로그램 시작점으로 호출하는데, 어떤 객체도 생성되지 않은 시점이다
       2-1. main메서드에서 p2 인스턴스 생성 후
            해당 인스턴스의 메서드를 호출하면 max메서드에 static 명시하지 않아도 됨.
     */
}
