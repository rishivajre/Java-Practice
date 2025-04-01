public class bubbleSort {
    // Bubble Sort algorithm: Sorts an array in ascending order
    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,0,-1};

        //bubbleSort(arr);
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    //swap arr[j] and arr[j+1]
                    // Using a temporary variable to swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // Print sorted array
        printArray(arr);
    }
}
// 🌟 How Bubble Sort Works:
// 🟢 Bubble Sort repeatedly compares adjacent elements in the array.
// 🔄 If the current element is greater than the next one, they are swapped. 🔄
// 🔁 This process "bubbles" the largest element to the end of the array in each iteration.

// 📱 Algorithm Steps:
// 1️⃣ Loop from 0 to n-1 (where n is the array length).
// 2️⃣ In each iteration:
//     - Compare adjacent elements. 🔍
//     - Swap them if they are in the wrong order. 🔄
// 3️⃣ Repeat until the array is fully sorted. ✅

// 💡 Key Points:
// - 🕒 Time Complexity: O(n²) in the worst and average cases.
// - 🟢 Best Case: O(n) when the array is already sorted (optimized version).
// - 🔁 Multiple swaps per iteration.
// - 🚀 Simple but inefficient for large datasets.