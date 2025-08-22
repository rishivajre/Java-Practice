import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UsingSetStreams {
    public static List<Integer> findMissing(int[] nums, int n) {
        // convert array -> Set

        Set<Integer> set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        return IntStream.rangeClosed(0, n)
                .filter(i -> !set.contains(i))
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 5, 4, 6, 6, 6, 8, 9, 2, 3, 11 };
        System.out.println(findMissing(arr, 11));
    }
}
