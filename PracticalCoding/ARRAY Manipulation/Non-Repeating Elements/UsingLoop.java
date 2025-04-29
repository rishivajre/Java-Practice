public class UsingLoop {
    // Find the first non-repeating element in an array
    public static int findFirstNonRepeating(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            boolean isRepeating = false;
            for(int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break;
                }
            }
            if(!isRepeating) {
                return arr[i];
            }
        }
        return -1; // No non-repeating element
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 0, 4};
        System.out.println(findFirstNonRepeating(arr));
    }
}


/**🔥 Approach 1: Basic Brute Force (O(n²))
Concept Used:

For every element, check in the entire array whether it repeats or not.

First element which does not repeat is our answer. */