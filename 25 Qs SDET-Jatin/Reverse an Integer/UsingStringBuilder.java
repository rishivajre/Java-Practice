public class UsingStringBuilder {
    public static int reverse(int num) {
        StringBuilder sb = new StringBuilder();
        int sign = num < 0 ? -1 : 1; // Determine the sign of the number
        // If the number is negative, we will handle it later by multiplying the result
        // by -
        num = Math.abs(num); // Here we take the absolute value of the number to simplify the reversal
                             // process
        sb.append(num);// Convert the number to a string and append it to StringBuilder
        // Example: If num is 12345, sb will contain "12345"
        sb.reverse();// Reverse the string representation of the number
        // Example: After reversing, sb will contain "54321"
        try {
            return Integer.parseInt(sb.toString()) * sign;
            // Convert the reversed string back to an integer and apply the original sign
            // Example: If the original number was -12345, the result will be -543
        } catch (NumberFormatException e) {
            // Handle overflow or underflow by returning 0
            return 0;
        }
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
