import java.util.Arrays;

public class ProductArrayExceptSelf {

    public static void main(String[] args) {
        int[] array = {2,4,6,8};
        System.out.println(Arrays.toString(productExceptSelf(array)));
    }
    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;

        for (int i=1; i<n; i++) {
            result[i] = result[i-1] * nums[i-1];
            
        }

        int right = 1;
        for (int i = n-1; i>=0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }
}