public class MaxKadaneAlgo {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];   //max sum 1st element at start
        int currSum = nums[0]; // Current Sum of SubArray

        for (int i=0; i<nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
                System.out.print(i + " currSum: " +currSum + " ");
            maxSum = Math.max(maxSum, currSum);
                System.out.println("maxSum: " +maxSum +" ");
        } System.out.println();
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}

/*Problem: Ek array mein subarray dhoondho jiska sum maximum ho. 
Example: [-2, 1, -3, 4, -1, 2, 1, -5, 4] ka max subarray sum = 6 ([4, -1, 2, 1]). */

/*
 * Dry Run: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

    i=0: maxSum = -2, currSum = -2
    i=1: currSum = max(1, -2+1) = 1, maxSum = max(-2, 1) = 1
    i=2: currSum = max(-3, 1-3) = -2, maxSum = 1
    i=3: currSum = max(4, -2+4) = 4, maxSum = 4
    i=4: currSum = max(-1, 4-1) = 3, maxSum = 4
    i=5: currSum = max(2, 3+2) = 5, maxSum = 5
    i=6: currSum = max(1, 5+1) = 6, maxSum = 6
    i=7: currSum = max(-5, 6-5) = 1, maxSum = 6
    i=8: currSum = max(4, 1+4) = 5, maxSum = 6 Result: 6
 */