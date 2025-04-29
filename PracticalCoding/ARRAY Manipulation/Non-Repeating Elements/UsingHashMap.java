/*🔥 Approach 2: Optimized (Two Pass using HashMap) (O(n))
Concept Used:

Pehla pass: Count frequency of each number using HashMap.

Dusra pass: First element jiska frequency == 1, wahi answer. */

import java.util.HashMap;

public class UsingHashMap {
    public static int findFirstNonrepeating(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // First pass: Count frequencies
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Second pass: Find first with Frequency 1
        for (int num : arr) {
            if (freqMap.get(num) == 1) {
                return num;
            }
        }
        return -1; // No non-repeating elements
    }

    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,6,4};
        System.out.println("First Non-Repeating element is: " + findFirstNonrepeating(arr)); // 3
    }
}
