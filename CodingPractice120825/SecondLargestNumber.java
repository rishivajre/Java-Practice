public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] array = {1,24,5,6,78,99};

        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = num;
            } else if (num > secondLargestNumber && secondLargestNumber != largestNumber) {
                secondLargestNumber = num;
            }
        }

        if (secondLargestNumber == Integer.MIN_VALUE) {
            System.out.println("No 2nd largest number all elements are same");
        } else {
            System.out.println("Largest Number: " + largestNumber);
            System.out.println("SecondLargeest Number : " + secondLargestNumber);
        }
    }
}
