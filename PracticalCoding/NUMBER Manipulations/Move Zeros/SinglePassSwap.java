import java.util.Arrays;

public class SinglePassSwap {   // Move Zeros to the End of an Array
    
    public static void moveZero(int[] arr) {    // Approach 2: Single-Pass Swap (Efficient) 
        if (arr == null) return;
        int nonZeroPos = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[nonZeroPos];
                arr[nonZeroPos++] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
