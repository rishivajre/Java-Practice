import java.util.*;

public class UsingStreamPrctc {
    public static void findIndicesWithStream(int[] arr, int searchElement) {
        List<Integer> indices = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if(arr[i] == searchElement) {
                indices.add(i);
            }
        }
        if (indices.isEmpty()) {
            System.out.println("Element not found!!");
        } else {
            System.out.println("Element found at indices: " + indices);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = scanner.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("ENter the searchElement:");
        int searchElement = scanner.nextInt();
        findIndicesWithStream(arr, searchElement);
        scanner.close();
    }
}
