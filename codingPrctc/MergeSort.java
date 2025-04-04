public class MergeSort {

    // Function to merge two sorted subarrays into a single sorted array
    public static void merge(int arr[], int left, int mid, int right) {
        // Calculate the sizes of the two subarrays
        int n1 = mid - left + 1; // Size of the left subarray
        int n2 = right - mid;    // Size of the right subarray

        // Create temporary arrays to hold the elements of the left and right subarrays
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        // Copy data into the temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i]; // Copy elements from the left subarray
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j]; // Copy elements from the right subarray
        }

        // Merge the two subarrays back into the original array
        int i = 0, j = 0, k = left; // Initialize pointers for leftArr, rightArr, and arr
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) { // Compare elements from both subarrays
                arr[k] = leftArr[i]; // Take the smaller element from leftArr
                i++;
            } else {
                arr[k] = rightArr[j]; // Take the smaller element from rightArr
                j++;
            }
            k++; // Move to the next position in the original array
        }

        // Copy any remaining elements from leftArr (if any)
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy any remaining elements from rightArr (if any)
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Function to perform Merge Sort on the array
    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) { // Base case: If the array has more than one element
            // Find the middle point of the array
            int mid = left + (right - left) / 2;

            // Recursively sort the left half of the array
            mergeSort(arr, left, mid);

            // Recursively sort the right half of the array
            mergeSort(arr, mid + 1, right);

            // Merge the two sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        // Input array to be sorted
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        // Perform Merge Sort on the array
        mergeSort(arr, 0, n - 1);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}