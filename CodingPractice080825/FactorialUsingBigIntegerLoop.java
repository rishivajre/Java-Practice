import java.math.BigInteger;

public class FactorialUsingBigIntegerLoop {
    public static void main(String[] args) {
        int num = 5;
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(result);
    }
}
