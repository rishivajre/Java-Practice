public class LeaderElementsinArray {
    public static void main(String[] args) {
        int[] a = { 14, 23, 56, 7, 8, 9, 0, 7, 2 };
        int length = a.length;
        int maxRight = a[length - 1];

        System.out.println(maxRight);

        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > maxRight) {
                maxRight = a[i];
                System.out.println(maxRight);
            }
        }
    }
}
