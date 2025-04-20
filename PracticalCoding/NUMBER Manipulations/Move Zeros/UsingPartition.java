import java.util.Arrays;

public class UsingPartition {
    public void moveZero(int[] arr) {
        if (arr == null) return;
        int boundary = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != 0) {
                arr[boundary++] = arr[i];
            }
        }
        for (int i=boundary; i<arr.length; i++) arr[i] = 0;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        UsingPartition uP = new UsingPartition();
        uP.moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
