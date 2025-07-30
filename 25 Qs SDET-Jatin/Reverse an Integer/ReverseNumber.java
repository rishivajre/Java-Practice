public class ReverseNumber {
    public static int reverse(int num) {
        int result = 0;
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);

        while (num != 0) {
            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && num % 10 > 7)) {
                // Check for overflow condition
                return 0; // Return 0 if overflow occurs
            }
            if(result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && num % 10 < -8)) {
                // Check for underflow condition
                return 0; // Return 0 if underflow occurs
            }
            // Extract the last digit and build the reversed number
            // Example: If num is 123, the last digit is 3, and we shift the current result left and add the last digit.
            // This effectively reverses the digits of the number.

            int lastDigit = num % 10; // Get the last digit of the number, e.g., for 123, lastDigit will be 3
            result = result * 10 + lastDigit; // Shift the current result left and add the last digit
            num /= 10; // Remove the last digit from the number, e.g., for 123, num becomes 12
            
            // Example: If num is 123, after the first iteration:
            // lastDigit = 3, result = 0 * 10 + 3 = 3, num = 123 / 10 = 12
            // After the second iteration: lastDigit = 2, result = 3 * 10 + 2 = 32, num = 12 / 10 = 1
            // After the third iteration: lastDigit = 1, result = 32 * 10 + 1 = 321, num = 1 / 10 = 0
            // The loop continues until num becomes 0, effectively reversing the digits of the number.            

        }
        return result * sign; // Return the reversed number with the original sign
    }

    public static void main(String[] args) {
        int number = 12345; // Example number to reverse
        int reversedNumber = reverse(number);
        System.out.println("Example 01 Reversed Number: " + reversedNumber); // Output: 54321

        number = -67890; // Example negative number to reverse
        reversedNumber = reverse(number);
        System.out.println("Example 02 Reversed Number: " + reversedNumber); // Output: -9876
    }
}
