public class UsingStringBuilder02 {
    public static int reverseUsingString(int num) {
        //check sign
        boolean isNegative = num < 0;
        // Convert to String and absolute value
        String numStr = Integer.toString(Math.abs(num));
        // Reverse the String
        String reversedStr = new StringBuilder(numStr).reverse().toString();

        try {
            int resultNum = Integer.parseInt(reversedStr);
            return isNegative ? -resultNum : resultNum;
        } catch (NumberFormatException e) {
            return 0; // Overflow and Underflowing Number Handling
        }
    }

    public static void main(String[] args) {
        int number = 12345; // Example number to reverse
        int reversedNumber = reverseUsingString(number);
        System.out.println("Example 01 Reversed Number: " + reversedNumber); // Output: 54321

        number = -67890; // Example negative number to reverse
        reversedNumber = reverseUsingString(number);
        System.out.println("Example 02 Reversed Number: " + reversedNumber); // Output: -9876
    }
}
