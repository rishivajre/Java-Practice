import java.util.stream.Stream;
 // Advanced Example: Infinite Fibonacci Sequence
public class InfiniteFibSequence {
    public static void main(String[] args) {
        Stream<long[]> fib = Stream.iterate(new long[]{0,1}, f -> new long[]{f[1], f[0] + f[1]});
        fib.limit(10).map(f -> f[0])
        .forEach(n -> System.out.print(n + " "));
    }
}

// This example generates an infinite stream of Fibonacci numbers using Stream.iterate.
