public class ReverseNumberUsingMath {
    public static int reverse(int num) {
        int result = 0;
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);

        while (num != 0){
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && num%10 > 7)) {
                return 0; // Checking overflow
            }
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE/10 && num%10 < -8)) {
                return 0;
            }

            int lastDigit = num % 10;
            result = result * 10 + lastDigit;
            num /= 10;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        int num = 234;
        System.out.println(reverse(num));
    }
}
