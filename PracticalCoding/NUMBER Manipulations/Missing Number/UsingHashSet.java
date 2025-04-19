import java.util.HashSet;
import java.util.Set;

public class UsingHashSet {
    public static int missingNum(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        for (int i=1; i<=n; i++) {
            if (!set.contains(i)) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = 5;

        System.out.println(missingNum(arr, n));
    }
}
