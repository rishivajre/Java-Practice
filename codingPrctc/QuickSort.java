public class QuickSort {

    // Partition function: Divides the array around the pivot
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];  // 🟡 Pivot element is the last element
        int i = low - 1;        // 🔵 Pointer for smaller elements [i left pointer hai (chhote elements ke liye)]

        // Traverse the array from low to high-1
        for (int j = low; j < high; j++) { // 🔁 j pointer array scan karega
            if (arr[j] < pivot) { // If current element is smaller than pivot
                i++; // Move the pointer for smaller elements, ⬆️ i ko aage badhao
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot in its correct position
        i++; // ✅ Pivot ko correct jagah pe rakhne ke liye
        // 🔄 Swap pivot with arr[i]
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i; // 🔁 Return karo pivot ki correct position
    }

    // QuickSort function: Recursively sorts the array
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // // 📍 Correct jagah mil gayi pivot ki, Partition the array

            // Recursively sort the left and right parts
            quickSort(arr, low, pivotIndex - 1); // 🔁 Left part sort karo
            quickSort(arr, pivotIndex + 1, high); // 🔁 Right part sort karo
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8}; // Input array
        int n = arr.length;

        quickSort(arr, 0, n - 1); // Call QuickSort

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}