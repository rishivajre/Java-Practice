import java.util.Arrays;

public class withoutTempArray { // without temp array creation and without substring
    void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k%n; // Handles k>n

        reverse(arr, 0, k-1); // reverse(arr, 0, 1) → reverse first k elements       i.e. [1, 2, 3, 4, 5] → [2, 1, 3, 4, 5]
        reverse(arr, k, n-1);   // reverse(arr, 2, 4) → reverse remaining n-k elements i.e. [2, 1, 3, 4, 5] → [2, 1, 5, 4, 3]
        reverse(arr, 0, n-1); // reverse(arr, 0, 4) → reverse the whole array        i.e. [2, 1, 5, 4, 3] → [3, 4, 5, 1, 2]
    }

    void reverse (int[] arr, int i, int j) {
        while (i<j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        withoutTempArray rotate = new withoutTempArray();
        //int[] rotated = rotate.rotateArray(arr, k);
        rotate.rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));
    }
    
}

/*

✅ Problem: Rotate array elements one by one (left or right). Don’t use extra array or collection.

Example (Left rotation)
Input: [1, 2, 3, 4, 5], Rotate by 2 → Output: [3, 4, 5,| 1, 2]


 */