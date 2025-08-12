import java.math.BigInteger;

public class FactorialUsingRecursion {
    public static BigInteger Factorial(int num) {
        
        if (num < 0) {
            throw new IllegalArgumentException("Negative numbers cant be done Factorial");
        }

        if (num == 0 || num == 1) {
            return BigInteger.ONE;
        } 
        return BigInteger.valueOf(num).multiply(Factorial(num - 1));

    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(Factorial(num));
    }
}
