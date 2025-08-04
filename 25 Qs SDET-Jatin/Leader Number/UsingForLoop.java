public class UsingForLoop {
    // Leader Numbers printing from Arrays
    public static void main(String[] args) {
        // Step 1: Define the input array
        int[] a = {16, 17, 4, 3, 5, 2};

        // Step 2: Store the length of the array
        int length = a.length;

        // Step 3: Assume the last element is always a leader (nothing on its right)
        int maxRight = a[length - 1];

        // Step 4: Print the last element (it's always a leader)
        System.out.println(maxRight);

        // Step 5: Traverse the array from second-last to first element
        for (int i = length - 2; i >= 0; i--) {
            // Step 6: If current element is greater than the max seen on the right,
            // it's a leader — print and update maxRight
            if (a[i] > maxRight) {
                maxRight = a[i];
                System.out.println(maxRight);
            }
        }
    }
}
