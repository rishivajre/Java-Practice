public class UsingWhileLoop {
    
    public static boolean CheckMountainArray(int[] a) {
        // A mountain array must have at least 3 elements.
        if (a.length < 3) {
            return false;
        }

        int i = 0;
        int n = a.length;

        // 1. Find the strictly increasing part.
        while (i + 1 < n && a[i] < a[i + 1]) {
            i++;
        }

        // 2. Check for edge cases: The peak cannot be the first or last element.
        // If 'i' is 0, the array is strictly decreasing (e.g., [3, 2, 1]).
        // If 'i' is the last element, the array is strictly increasing (e.g., [1, 2, 3]).
        if (i == 0 || i == n - 1) {
            return false;
        }

        // 3. Find the strictly decreasing part.
        while (i + 1 < n && a[i] > a[i + 1]) {
            i++;
        }

        // 4. If we have reached the end of the array, it's a valid mountain array.
        return i == n - 1;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1, 0};
        System.out.println(CheckMountainArray(a)); // true
        
        int[] b = {1, 2, 3, 4};
        System.out.println(CheckMountainArray(b)); // false (purely increasing)
        
        int[] c = {4, 3, 2, 1};
        System.out.println(CheckMountainArray(c)); // false (purely decreasing)

        int[] d = {1, 3, 2, 3};
        System.out.println(CheckMountainArray(d)); // false (not a single peak)
    }

    
}
