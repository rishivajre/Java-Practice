public class ReverseAnIntegerUsingMathLoop {
    public static int reverse(int num) {
        int result = 0;
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);

        while (num != 0) {
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && num % 10 > 7)) {
                return 0; // Overflow check
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && num % 10 < -8)) {
                return 0; // Underflow check
            }
            int lastDigit = num % 10; // get end digits
            result = result * 10 + lastDigit; // add digits in result and multiply by 10 and then 
            num /= 10; // reduce original number by one digit each time
        }

        return result * sign;
    }

    public static void main(String[] args) {
        int number = 223;
        System.out.println(reverse(number));
    }
}
