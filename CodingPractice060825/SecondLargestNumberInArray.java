public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] numbers = { 12, 45, 22, 66, 76, 11 };
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largestNumber) {
                secondLargestNum = largestNumber;
                largestNumber = num;
            } else if (num > secondLargestNum && num != largestNumber) {
                secondLargestNum = num;
            }
        }
        // Handling edge case if All nums are same or there's no valid secondlargest
        if (secondLargestNum == Integer.MIN_VALUE) {
            System.out.println("No 2nd largest number found, possibly all the elements are same");
        } else {
            System.out.println("LargestNum: " + largestNumber + " SecondLargestNumber: " + secondLargestNum);
        }
    }
}
