import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UsingStream {
    public static void findIndicesWithStream(int[] arr, int searchElement) {
        List<Integer> indices = IntStream.range(0, arr.length)
                                .filter(n -> arr[n] == searchElement)
                                .boxed()
                                .collect(Collectors.toList());
        if (indices.isEmpty()) {
            System.out.println("Ele not found");
        }else{
            System.out.println("element found at indices: "+ indices);
        }
    }           

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for (int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter search element: ");
        int searchElement = scanner.nextInt();
        
        findIndicesWithStream(arr, searchElement);
        scanner.close();
    }
}
