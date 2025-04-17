import java.util.stream.Stream;

public class InfiniteStreamDemo {

    // Basic Example: Generating an Infinite Stream of Integers with limit()

    public static void main(String[] args) {
        Stream<Integer> infiStream = Stream.iterate(0, n-> n+5);
        infiStream.limit(5).forEach(n->System.out.println(n));
    }
}

/**
 * Explanation
Basic: Uses Stream.iterate to create a sequence of integers.
Moderate: Uses Stream.generate to produce random values.
Advanced: Demonstrates a more complex use of Stream.iterate to calculate Fibonacci numbers.
 */