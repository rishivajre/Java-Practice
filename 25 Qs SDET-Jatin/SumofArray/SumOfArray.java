public class SumOfArray {

    public static void main(String[] args) {

        // ============================
        // ✅ Input: Array of integers
        // ============================
        int[] numbers = { 1, 20, 30, 40 };

        // ============================
        // ✅ Method 1: Using traditional for-loop with index
        // ============================
        int sumUsingIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            sumUsingIndex += numbers[i]; // same as: sumUsingIndex = sumUsingIndex + numbers[i];
        }

        System.out.println("✅ Sum using for-loop with index: " + sumUsingIndex);

        // ============================
        // ✅ Method 2: Using enhanced for-each loop
        // ============================
        int sumUsingForEach = 0;

        for (int num : numbers) {
            sumUsingForEach += num;
        }

        System.out.println("✅ Sum using enhanced for-each loop: " + sumUsingForEach);
    }
}
