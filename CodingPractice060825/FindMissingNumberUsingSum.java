public class FindMissingNumberUsingSum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int n = arr.length + 1; // since one num is missing; total length should be n + 1;

        int expectedSum = (n * (n+1)) /2;
        System.out.println("Expected Sum (1 to " + n + "): " + expectedSum);

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        System.out.println("Actual sum: " + actualSum);

        int missingNum = expectedSum - actualSum;
        System.out.println("Missing Number from array is: " + missingNum);
    }
}
