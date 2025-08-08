import java.math.BigInteger;

public class FactorialUsingRecursion {
    public static BigInteger factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial isnot defined for -ve nums!");
        }
        if ( num == 0 || num == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(num).multiply(factorial(num - 1));
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }
    
}
