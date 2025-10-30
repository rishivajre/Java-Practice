import java.math.BigInteger;

public class FactorialUsingRecursion {
    public static BigInteger factorialRec(int num) {
        if (num < 0 ) {
            throw new IllegalArgumentException("Factorial isn't defined for less than 0");
        }
        if (num == 0 || num == 1) {
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(num).multiply(factorialRec(num-1));
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorialRec(num));
    }
}

