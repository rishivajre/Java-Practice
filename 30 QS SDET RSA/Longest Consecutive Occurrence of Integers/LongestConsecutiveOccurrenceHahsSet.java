import java.util.*;

public class LongestConsecutiveOccurrenceHahsSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        int[] arr = { 1,11,4, 3, 25, 5, 6, 7, 8, 9, 2, 3, 10 }; 
        // whatever the order of nums is it will count increament of all 1 t0 11 : 11
        int count = 0;
        int max = 0;

        for (int num : arr)
            set.add(num);

        for (int num : set) {
            if (!set.contains(num - 1)) { // start of the sequence
                int current = num, streak = 1;
                while (set.contains(current + 1)) {
                    current++;
                    streak++;
                }
                max = Math.max(streak, max);
            }
        }

        System.out.println(max);
    }
}
