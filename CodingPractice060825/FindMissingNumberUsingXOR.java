public class FindMissingNumberUsingXOR {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 5, 6 };
        int totalLength = array.length + 1; // one number is missing, total = n + 1

        int xorExpextedArray = 0;
        for (int i = 1; i <= totalLength; i++) {
            xorExpextedArray ^= i; //XOR of Expected Array
        }

        int xorActualArray = 0;
        for (int num : array) {
            xorActualArray ^= num; // XOR of Actual Array
        }

        int miisingNum = xorExpextedArray ^ xorActualArray;

        System.out.println(miisingNum);
    }
}
