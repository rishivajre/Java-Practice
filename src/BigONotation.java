public class BigONotation {

        // O(1) - Constant time complexity
        // यह method constant time complexity में काम करता है
        public static void constantTime(int[] array) {
            System.out.println(array[0]); // हमेशा array का पहला element print करेगा
        }
    
        // O(n) - Linear time complexity
        // यह method linear time complexity में काम करता है
        public static void linearTime(int[] array) {
            for (int i : array) {
                System.out.println(i); // array के सभी elements को print करेगा
            }
        }
    
        // O(n^2) - Quadratic time complexity
        // यह method quadratic time complexity में काम करता है
        public static void quadraticTime(int[][] matrix) {
            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.println(element); // matrix के सभी elements को print करेगा
                }
            }
        }
    
        // O(log n) - Logarithmic time complexity
        // यह method logarithmic time complexity में काम करता है
        public static int binarySearch(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (array[mid] == target) {
                    return mid; // target element मिल गया
                } else if (array[mid] < target) {
                    left = mid + 1; // search को right half में shift करें
                } else {
                    right = mid - 1; // search को left half में shift करें
                }
            }
            return -1; // target element नहीं मिला
        }
    
        // O(n log n) - Linearithmic time complexity
        // यह method linearithmic time complexity में काम करता है
        public static void mergeSort(int[] array, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;
                mergeSort(array, left, mid); // left half को sort करें
                mergeSort(array, mid + 1, right); // right half को sort करें
                merge(array, left, mid, right); // दोनों halves को merge करें
            }
        }
    
        // Merge function to merge two halves
        // यह function दो halves को merge करता है
        private static void merge(int[] array, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;
            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];
            System.arraycopy(array, left, leftArray, 0, n1);
            System.arraycopy(array, mid + 1, rightArray, 0, n2);
            int i = 0, j = 0, k = left;
            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    array[k++] = leftArray[i++]; // leftArray का element merge करें
                } else {
                    array[k++] = rightArray[j++]; // rightArray का element merge करें
                }
            }
            while (i < n1) {
                array[k++] = leftArray[i++]; // बचे हुए leftArray के elements merge करें
            }
            while (j < n2) {
                array[k++] = rightArray[j++]; // बचे हुए rightArray के elements merge करें
            }
        }
    
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            int[][] matrix = {{1, 2}, {3, 4}};
    
            constantTime(array); // constant time complexity method call
            linearTime(array); // linear time complexity method call
            quadraticTime(matrix); // quadratic time complexity method call
            System.out.println(binarySearch(array, 3)); // logarithmic time complexity method call
            mergeSort(array, 0, array.length - 1); // linearithmic time complexity method call
            for (int i : array) {
                System.out.println(i); // sorted array print करें
            }
        }
    }

    /* Explanation:
constantTime: यह method constant time complexity में काम करता है, जो हमेशा array का पहला element print करता है।
linearTime: यह method linear time complexity में काम करता है, जो array के सभी elements को print करता है।
quadraticTime: यह method quadratic time complexity में काम करता है, जो matrix के सभी elements को print करता है।
binarySearch: यह method logarithmic time complexity में काम करता है, जो sorted array में target element को search करता है।
mergeSort: यह method linearithmic time complexity में काम करता है, जो array को sort करता है।
merge: यह function दो sorted halves को merge करता है।
main: यह method सभी methods को call करता है और उनके results को print करता है। */