
import java.math.BigInteger;

public class UsingRecursion {
    public static BigInteger factorialByRecursion(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial isn't defined for -ve Nums!!");
        }
        if (num == 0 || num == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(num).multiply(factorialByRecursion(num - 1));
    }

    public static void main(String[] args) {
        int num = 25;
        System.out.println(factorialByRecursion(num));
    }
}