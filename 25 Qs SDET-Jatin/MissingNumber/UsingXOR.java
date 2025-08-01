public class UsingXOR {

    public static void main(String[] args) {

        // ============================
        // ✅ Solution 1: Using XOR Logic: Input array from 1 to 6, with one number missing (3)
        // ============================

        int[] array = { 1, 2, 4, 5, 6 }; // Missing number is 3
        int totalLength = array.length + 1; // Total numbers expected: 6

        // XOR of all numbers from 1 to n (inclusive)
        int xorFullRange = 0;
        for (int i = 1; i <= totalLength; i++) {
            xorFullRange ^= i; // same as xorFullRange = xorFullRange ^ i;
        }
        System.out.println("XOR of full range: " + xorFullRange);

        // XOR of all elements in the given array
        int xorArray = 0;
        for (int num : array) {
            xorArray ^= num;
        }
        System.out.println("XOR of array elements: " + xorArray);

        // XOR of both = missing number (because all matching numbers cancel out)
        int missing1 = xorFullRange ^ xorArray;
        System.out.println("✅ Missing Number (Solution 1): " + missing1);

        System.out.println("--------------------------------------------------");

        // ============================
        // ✅ Solution 2: Compact XOR-based approach (No separate variables)
        // Another array with one missing number (4)
        // ============================

        int[] numbers = { 1, 2, 3, 5, 6 }; // Missing number is 4
        int missing2 = 0;

        // XOR all elements in the array
        for (int num : numbers) {
            missing2 ^= num;
        }

        // XOR all numbers from 1 to n (where n = array.length + 1)
        for (int i = 1; i <= numbers.length + 1; i++) {
            missing2 ^= i;
        }

        System.out.println("✅ Missing Number (Solution 2): " + missing2);
    }
}
