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

Left Array Rotation (by k steps)
|
|-- Step 1: Reverse Part 1 (from 0 to k-1)
|     Input:  [1, 2, 3, 4, 5],  k = 2
|     Result: [2, 1, 3, 4, 5]
|
|-- Step 2: Reverse Part 2 (from k to n-1)
|     Reverse [3, 4, 5] → [5, 4, 3]
|     Result: [2, 1, 5, 4, 3]
|
|-- Step 3: Reverse Whole Array (from 0 to n-1)
|     Reverse [2, 1, 5, 4, 3] → [3, 4, 5, 1, 2]
|
|-- ✅ Final Rotated Array (Left Rotate by 2): [3, 4, 5, 1, 2]

📌 Key Points:
✅ In-place (no extra space)

✅ Time Complexity: O(n)

✅ Space Complexity: O(1)

✅ Works for any value of k (even when k > n)

k = k % n handles overflow

🔄 Same logic can be used for Right Rotation with a different sequence of reversals.


Right Array Rotation (by k steps)
|
|-- Step 1: Reverse Last k Elements (from n-k to n-1)
|     Input:  [1, 2, 3, 4, 5],  k = 2
|     Reverse [4, 5] → [5, 4]
|     Result: [1, 2, 3, 5, 4]
|
|-- Step 2: Reverse First n-k Elements (from 0 to n-k-1)
|     Reverse [1, 2, 3] → [3, 2, 1]
|     Result: [3, 2, 1, 5, 4]
|
|-- Step 3: Reverse Whole Array (from 0 to n-1)
|     Reverse [3, 2, 1, 5, 4] → [4, 5, 1, 2, 3]
|
|-- ✅ Final Rotated Array (Right Rotate by 2): [4, 5, 1, 2, 3]


 */