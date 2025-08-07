public class MountainArrayCheck {
    public static boolean checkMountainArray(int[] a) {
        if (a.length < 3) {
            return false;
        }

        int i = 0;
        int n = a.length;

        while (i + 1 < n && a[i] < a[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) {
            return false;
        }

        while (i + 1 < n && a[i] > a[i + 1]) {
            i++;
        }
        return i == n - 1;
    }

    public static void main(String[] args) {
        int aa[] = { 1, 2, 3, 4, 3, 2, 1 };
        System.out.println(checkMountainArray(aa));
    }
}
