import java.util.HashSet;
import java.util.Set;

public class UsingHashSet {
    public static int missingNum(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        for (int i=1; i<arr.length; i++) {
            if (!set.contains(i)) return i;
        } 
        return -1;  // Edge Case: Agar koi number nahi milta, return -1 (though problem guarantees one missing number).
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        int n = 5;

        System.out.println(missingNum(arr, n));
    }
}
