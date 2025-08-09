public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 9, 0, 8 };

        int nonZeroIndex = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
        
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
