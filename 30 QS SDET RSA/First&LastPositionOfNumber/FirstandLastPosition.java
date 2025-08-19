public class FirstandLastPosition {
    public static void main(String[] args) {
        int[] array = {5,7,8,8,9,10};

        int firstIndex = -1;
        int lastIndex = -1;

        int target = 8;

        for (int i=0; i<array.length; i++) {
            if (array[i] == target && firstIndex == -1) {
                firstIndex = i;
            }

            if (array[i] == target && firstIndex != -1) {
            lastIndex = i;
        }

        
        }

        System.out.println("FirstIndex is : " + firstIndex + " Last: " + lastIndex);

    }
}
