import java.util.stream.Stream;

public class InfiniteStreamDemo {

    // Basic Example: Generating an Infinite Stream of Integers with limit()

    public static void main(String[] args) {
        Stream<Integer> infiStream = Stream.iterate(0, n-> n+5);
        infiStream.limit(5).forEach(n->System.out.println(n));
    }
}
