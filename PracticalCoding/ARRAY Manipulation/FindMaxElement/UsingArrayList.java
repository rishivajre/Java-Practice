import java.util.ArrayList;

public class UsingArrayList {
    public static void main(String[] args) {
        int[] arr1 = {1,2,89,4};
        int[] arr2 = {7,9,76,6};

        //List to store max elements
        ArrayList<Integer> maxArr = new ArrayList<>();

        for (int i=0; i<arr1.length; i++) {
            // compare ele
            if (arr1[i] > arr2[i]){
                maxArr.add(arr1[i]);
            } else {
                maxArr.add(arr2[i]);
            }
        }

        System.out.println("Maximum values from arr1 and arr2: " + maxArr);
    }
}
