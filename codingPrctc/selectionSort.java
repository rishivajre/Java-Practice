public class selectionSort {
    // Selection Sort algorithm: Sorts an array in ascending order
    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1, 0, -1};

        // Selection Sort algorithm
        for (int i=0; i<arr.length-1; i++) {
            // Find the min element in each unsorted part
            int smallest = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[smallest]){
                    smallest = j; // Update index of the smallest element
                }
                int temp = arr[smallest]; // Store the smallest element in a temporary variable
                // Swap the smallest element with the first unsorted element
                arr[smallest] = arr[i]; // Swap the smallest element with the first unsorted element
                arr[i] = temp; // Swap the smallest element with the first unsorted element
            }
        }

        // Print sorted array
        printArray(arr);
    }
}
// 🌟 How Selection Sort Works:
// 🟢 Similar to Bubble Sort, but instead of swapping adjacent elements repeatedly,
// 🔍 It finds the **minimum element** from the unsorted part of the array 
//    and swaps it with the **first unsorted element**.

// 🔄 Algorithm Steps:
// 1️⃣ Loop from 0 to n-1 (where n is the array length).
// 2️⃣ In each iteration:
//     - Find the **smallest element** in the unsorted part. 🔽
//     - Swap it with the **first unsorted element**. 🔄
// 3️⃣ Repeat until the entire array is sorted. ✅

// 💡 Key Points:
// - 🕒 Time Complexity: O(n²) in all cases (worst, average, best).
// - 🔁 1 swap per iteration.
// - 🚀 Simple but not efficient for large datasets.