import java.util.Random;
import java.util.stream.Stream;

public class InfiniteStreamRandom { // Using Stream.generat()
    public static void main(String[] args) {
        Random rndm = new Random();
        Stream<Double> rndmNumbers =
            Stream.generate(rndm::nextDouble);

        /*
            Stream<Integer> rndmNumbers =
            Stream.generate(rndm::nextInt);   OR  

            Stream<Boolean> rndmNumbers =
            Stream.generate(rndm::nextBoolean); --> t f f t t
         * 
         */

        rndmNumbers.limit(5).forEach(System.out::println);
    }
}

/*
 *Moderate Example: Infinite Stream of Random Numbers
This example generates an infinite stream of random numbers using Stream.generate.
 */