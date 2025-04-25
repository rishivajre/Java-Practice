import java.util.*;

public class UsingHashMap {

    public static void findIndicesWithHashMap(int[] arr, int searchElement) {
        //Create HashMap to store element -> list of indices
        Map<Integer, List<Integer>> indexMap = new HashMap<>();
        //populate Hashmap
        for (int i=0; i<arr.length; i++) {
            indexMap.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }

    }
}