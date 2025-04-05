class Exercise6_20 {
    public static int max(int[] arr) {
        if (arr == null || arr.length == 0 ) {
            return -999999;
        }
        int res = arr[0];

        for (int num: arr) {
            if (num > res) {
                res = num;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값: " + max(data));
        System.out.println("최대값: " + max(null));
        System.out.println("최대값: " + max(new int[] {}));
    }
}
