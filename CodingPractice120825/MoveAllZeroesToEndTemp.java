public class MoveAllZeroesToEndTemp {
    public static void main(String[] args) {
        int[] array = {0,0,0,0,0,0,0,1,2,0,3,6,0,4,9,8,9};

        int nonZeroIndex = 0;

        for (int i=0; i<array.length; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex] = array[i];
                nonZeroIndex++;
            }
        }

        while (nonZeroIndex < array.length) {
            array[nonZeroIndex] = 0;
            nonZeroIndex++;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
