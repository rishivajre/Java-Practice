public class LongestConsecutiveOccurrenceArrayofIntegers {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 };
        int count = 1; //Start from 1 because a single element counts as length 1
        int max = 1;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                count++;
            } else { 
                count = 1; // Reset to 1 (current element itself)
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
/*
 * In this problem, we need to find the length of the longest consecutive
 * occurrence.
 * As given in the array below, we have an array of integers.
 * As you can see the longest consecutive occurrence of integers are 6,7,8,9.
 * There is a consecutive increment of 1 . So the output will be 4.
 */