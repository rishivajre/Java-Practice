public class MountainArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 3, 2, 1 };

        System.out.println(checkMountainArray(array));
    }

    public static boolean checkMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int i = 0;
        int n = arr.length;

        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) {
            return false;
        }

        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}
