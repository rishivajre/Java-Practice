public class SecndLargestNumberUsingLoop {
    public static void main(String[] args) {
        int arr[] = { 23, 4, 554, 6756, 77868, 88, 9 };

        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largestNumber) {
                secondLargestNum = largestNumber;
                largestNumber = num;
            } else if (num > secondLargestNum && num != largestNumber) {
                secondLargestNum = num;
            }
        }

        if (secondLargestNum == Integer.MIN_VALUE) {
            System.out.println("Possibly all elements are same");
        } else {
            System.out.println(secondLargestNum);
        }
    }
}
