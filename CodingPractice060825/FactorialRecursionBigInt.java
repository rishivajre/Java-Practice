import java.math.BigInteger;

public class FactorialRecursionBigInt {
    public static BigInteger reverseNum(int num) {
        if (num < 0 ) {
            throw new IllegalArgumentException("Factorial cant be defined for -ve Nums!!");
        }
        if (num == 0 || num == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(num).multiply(reverseNum(num - 1));
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(reverseNum(num));
    }
}

