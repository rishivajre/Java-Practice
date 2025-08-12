public class FindMissingNuminArrayUsingSum {
    public static void main(String[] args) {
        int[] arr ={1,2,4,5,6};
        int n = arr.length + 1;

        int expectedSum = (n * (n + 1))/2;
        System.out.println(expectedSum);

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        System.out.println(actualSum);

        int missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);
    }
}
