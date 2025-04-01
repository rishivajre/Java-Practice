public class InsertionSort {
    // Insertion Sort algorithm: Sorts an array in ascending order
    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,0,-1};

        // Insertion Sort algorithm
        for (int i=1; i<arr.length; i++) {
            int key = arr[i]; // The current element to be inserted
            int j = i-1; // The last index of the sorted part

            // 🔄 Shift elements of the sorted part to the right
            while ( j>=0 && arr[j] > key) {
                arr[j+1] = arr[j]; // Shift elements to the right (0th -> 1st, 1st -> 2nd, ...)
                j--; // Move to the previous element in the sorted part 
                        //which is now empty because of the shift
            }
            // ✅ Insert the "key" into its correct position
            arr[j+1] = key; // Insert the key in its correct position (-1+1 = 0, 1+1 = 2, ...)
        }
        printArray(arr); // Print sorted array
    }
}

// 🌟 How Insertion Sort Works:
// 🟢 Insertion Sort builds the sorted array one element at a time.
// 🔄 It picks an element from the unsorted part and places it in the correct position in the sorted part.

// 🔄 Algorithm Steps:
// 1️⃣ Start with the second element (index 1) as the "key".
// 2️⃣ Compare the "key" with elements in the sorted part (to its left).
// 3️⃣ Shift elements in the sorted part to the right if they are greater than the "key". 🔄
// 4️⃣ Insert the "key" into its correct position. ✅
// 5️⃣ Repeat for all elements in the array.

// 💡 Key Points:
// - 🕒 Time Complexity: O(n²) in the worst and average cases.
// - 🟢 Best Case: O(n) when the array is already sorted.
// - 🚀 Efficient for small datasets or nearly sorted arrays.