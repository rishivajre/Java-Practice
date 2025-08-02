public class UsingLoops {
    public static void main (String[] args) {
        int[] a = {1,2,8,34,56,7};
        int largestNumber = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > largestNumber) {
                secondLargest = largestNumber;
                largestNumber = num;
            }
            else if (num > secondLargest && num != largestNumber) {
                secondLargest = num;
            }
        }
        System.out.println("The Second largest number is: " + secondLargest);
    }
}
