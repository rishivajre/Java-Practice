public class WithoutUsingTempVariable {
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,3,0,6};

        int nonZeroIndex = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
