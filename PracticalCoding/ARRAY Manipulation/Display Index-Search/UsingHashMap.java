import java.lang.annotation.ElementType;
import java.util.*;

public class UsingHashMap { // finding indices of a search element in an array

    public static void findIndicesWithHashMap(int[] arr, int searchElement) {
        //Create HashMap to store element -> list of indices
        Map<Integer, List<Integer>> indexMap = new HashMap<>();
        //populate Hashmap
        for (int i=0; i<arr.length; i++) {
            indexMap.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }
        // Check if searchElement exists in the map
        List<Integer> indices = indexMap.getOrDefault(searchElement, new ArrayList<>());
        if (indices.isEmpty()) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at indices: " + indices);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter search element:");
        int searchElement = scanner.nextInt();
        findIndicesWithHashMap(arr, searchElement);
        scanner.close();
    }
}