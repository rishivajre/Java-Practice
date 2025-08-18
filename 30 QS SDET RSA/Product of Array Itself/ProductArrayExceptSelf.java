import java.util.Arrays;

public class ProductArrayExceptSelf {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(array)));
    }

    public static int[] productExceptSelf(int[] nums) {

       int n = nums.length;
       int[] result = new int[n];
       result[0] = 1;

       for (int i = 1; i <n; i++) {
        result[i] = result[i-1] * nums[i -1];

       }
    }
}
/* What the Question Means

Problem statement:
Given an array of integers nums, for each element, 
calculate the product of all other elements except the one at that index.

HOW ?

For index 0 → multiply everything except nums[0]: 2 × 3 × 4 = 24

For index 1 → multiply everything except nums[1]: 1 × 3 × 4 = 12

For index 2 → multiply everything except nums[2]: 1 × 2 × 4 = 8

For index 3 → multiply everything except nums[3]: 1 × 2 × 3 = 6 

Example

Input:  [1, 2, 3, 4]
Output: [24, 12, 8, 6]
*/