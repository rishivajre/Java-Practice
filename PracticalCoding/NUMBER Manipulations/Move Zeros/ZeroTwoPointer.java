import java.util.Arrays;

public class ZeroTwoPointer {
    
    public static void moveZeroToEnd (int[] arr) {
        int nonZeroPos =0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != 0) arr[nonZeroPos++] = arr[i];
        }

        while (nonZeroPos < arr.length) arr[nonZeroPos++] = 0;
    }


    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,9,8};
        moveZeroToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
