public class SumFormulaApproach {
    public static void main(String[] args) {
        int array[] = { 1, 2, 4, 5, 6 };

        int n = array.length + 1;
        int expectedSum = (n * (n + 1)) / 2; // Formula: sum = n * (n + 1) / 2
        System.out.println(expectedSum);

        int actualSum = 0;
        for (int sum : array) {
            actualSum += sum;
        }
        System.out.println(actualSum);

        int missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);
    }
}
