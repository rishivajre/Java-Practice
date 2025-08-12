public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] array = {1,0,2,0,9,9,8,0,777,8,9,5,6,2};

        int nonZeroIndex = 0; // this is a pointer to track position of next non - zero element

        for (int i=0; i<array.length; i++) {
            if (array[i] != 0) { // swap current index value with non zzero index
                int temp = array[nonZeroIndex];
                array[nonZeroIndex] = array[i];
                array[i] = temp;
                nonZeroIndex++;
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    
}
