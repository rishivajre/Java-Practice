public class ReverseNumberMathWhile {
    // Reverse a Number with Math & while Loop
    public static int reverseNum(int num) {
        int result = 0;
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);

        while (num != 0) {
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && num % 10 > 7)) {
                // check for overflow
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && num % 10 < -8)) {
                return 0; // check of underflow
            }
            int lastDigit = num % 10;
            result = result * 10 + lastDigit; // Shift the current result to left and add the lastDigit
            num /= 10; // Remove the last digit from num; 123 --> 12
        }

        return result * sign;
    }

    public static void main(String[] args) {
        int num = 455;
        System.out.println(reverseNum(num));
        String num2 = "-0123";
        System.out.println(reverseNum(Integer.parseInt(num2)));
    }
}
