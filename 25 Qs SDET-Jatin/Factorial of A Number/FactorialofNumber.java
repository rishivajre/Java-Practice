import java.math.BigInteger;

public class FactorialofNumber {

    public static void main(String[] args) {
        int num = 5;
        BigInteger result = BigInteger.ONE;

        for (int i=2; i<=num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }

}