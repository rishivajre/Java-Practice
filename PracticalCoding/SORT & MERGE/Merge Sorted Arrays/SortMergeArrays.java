import java.util.Arrays;

public class SortMergeArrays {
    public static int[] sortAndMerge(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] merged = new int[arr1.length + arr2.length];
        int i=0; 
        int j=0; 
        int k=0;

        // Two Pointer Merge
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Remaining elements
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {4,7,2};
        int[] arr2 = {9,69, 00};

        System.out.println(Arrays.toString(sortAndMerge(arr1, arr2)));
    }
}
