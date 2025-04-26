import java.util.*;
import java.util.stream.*;
public class UsingStreamPrctc {
    public static void findIndicesWithStream(int[] arr, int searchElement) {
        List<Integer> indices = IntStream.range(0, arr.length)
                                        .filter(i -> arr[i] == searchElement)
                                        .boxed()
                                        .collect(Collectors.toList());
        if (indices.isEmpty()) {
            System.out.println("Element not found!!");
        } else {
            System.out.println("Element found at indices: " + indices);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter array size: ");
        int n = scanner.nextInt();
        System.out.println("Enter the array elements");
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter search element:");
        int searchElement = scanner.nextInt();
        findIndicesWithStream(arr, searchElement);
        scanner.close();
    }
}
