public class FindMissingNumberUsingXOR {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 5, 6 };
        int totalLength = array.length + 1; // one number is missing, total = n + 1

        int xorExpextedArray = 0;
        for (int i = 1; i <= totalLength; i++) {
            xorExpextedArray ^= i; // XOR of Expected Array
        }

        int xorActualArray = 0;
        for (int num : array) {
            xorActualArray ^= num; // XOR of Actual Array
        }

        int miisingNum = xorExpextedArray ^ xorActualArray;

        System.out.println(miisingNum);

        // Solution 02 without creating extra Variables:
        int[] numbers = { 1, 2, 3, 5, 6 };
        int missingNum2 = 0;
        for (int num : numbers) {
            missingNum2 ^= num;
        }

        for (int i = 1; i <= numbers.length + 1; i++) {
            missingNum2 ^= i;
        }

        System.out.println(missingNum2);
    }
}
