public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int secondLargestNum = Integer.MIN_VALUE;
        int largestNum = Integer.MIN_VALUE;

        for (int number : array) {
            if (number > largestNum) {
                secondLargestNum = largestNum;
                largestNum = number;
            } else if (number > secondLargestNum && secondLargestNum != largestNum) {
                secondLargestNum = number;
            }
        }
        System.out.println("Largest no: " + largestNum);
        System.out.println("Second Largest: " + secondLargestNum);

    }
}
