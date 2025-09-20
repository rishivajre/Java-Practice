import java.util.Arrays;

public class ShiftAllNegativesToLeft {
    public static void main(String[] args) {
        int arr[] = {-5, 1, 2, 3, -3, -2, 0, 5, 6};

        int left = 0;

        for (int i=0; i< arr.length; i++) {
            if (arr[i] < 0) {
                // Swap arr[i] with arr [left]
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }

        // Print the result
        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));

    }
}
