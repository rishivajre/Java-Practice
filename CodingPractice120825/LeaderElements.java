public class LeaderElements {
    public static void main(String[] args) {
        int[] a = { 16, 17, 67, 34, 6, 9, 3, 1 };

        int length = a.length;

        int maxright = a[length - 1];

        System.out.print(maxright + " ");

        for (int i = length - 2; i >= 0; i--) {
            if (a[i] > maxright) {
                maxright = a[i];
                System.out.print(maxright + " ");
            }
        }

    }
}
