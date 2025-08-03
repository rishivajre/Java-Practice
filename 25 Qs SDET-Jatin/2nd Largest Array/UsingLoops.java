public class UsingLoops {
    public static void main(String[] args) {
        
        // Input array
        int[] a = {1, 2, 8, 34, 56, 7};

        // Initialize both as minimum possible integer values
        int largestNumber = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the array once to find largest and second largest
        for (int num : a) {
            if (num > largestNumber) {
                // Update second largest before updating largest
                secondLargest = largestNumber;
                largestNumber = num;
            }
            // Check if the current number is smaller than largest, but greater than current second largest
            else if (num > secondLargest && num != largestNumber) {
                secondLargest = num;
            }
        }

        // Handle the case where all elements are same or there's no valid second largest
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found (possibly all elements are the same).");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}