public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,0,5,0000,8,9,8,9};
        int nonZeroIndex = 0;

        for (int i = 0; i<=arr.length-1; i++) {
            if (arr[i] != 0) {
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex++;            
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
