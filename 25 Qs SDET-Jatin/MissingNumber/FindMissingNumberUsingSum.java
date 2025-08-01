public class FindMissingNumberUsingSum {

    public static void main(String[] args) {

        // ============================
        // ✅ INPUT: Array with one number missing in 1 to N
        // ============================
        int[] array = {1, 2, 4, 5, 6}; // Missing number is 3
        int n = array.length + 1; // Since one number is missing, total should be n+1

        // ============================
        // ✅ Step 1: Calculate Expected Sum using Formula
        // Formula: sum = n * (n + 1) / 2
        // ============================
        int expectedSum = (n * (n + 1)) / 2;
        System.out.println("Expected Sum (1 to " + n + "): " + expectedSum);

        // ============================
        // ✅ Step 2: Calculate Actual Sum from the given array
        // ============================
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        System.out.println("Actual Sum (from array): " + actualSum);

        // ============================
        // ✅ Step 3: Missing number = expectedSum - actualSum
        // ============================
        int missingNumber = expectedSum - actualSum;
        System.out.println("✅ Missing Number is: " + missingNumber);
    }
}
