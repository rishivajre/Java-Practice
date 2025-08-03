public class MoveAllZeroesToEnd {

    public static void main(String[] args) {

        // ============================
        // ✅ Input: Array with zeroes and non-zero integers
        // ============================
        int[] arr = {1, 0, 2, 0, 3, 0, 4};

        // ============================
        // ✅ Pointer to track position of next non-zero element
        // ============================
        int nonZeroIndex = 0;

        // ============================
        // ✅ Loop through the array and move non-zero elements to the front
        // ============================
        for (int currentIndex = 0; currentIndex < arr.length; currentIndex++) {
            if (arr[currentIndex] != 0) {
                // Swap current non-zero with value at nonZeroIndex
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[currentIndex];
                arr[currentIndex] = temp;

                // Move nonZeroIndex forward
                nonZeroIndex++;
            }
        }

        // ============================
        // ✅ Output the modified array
        // ============================
        System.out.print("✅ Array after moving zeroes to end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
