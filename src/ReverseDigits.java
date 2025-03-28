public class ReverseDigits {
    public static int reverseFirstAndLast(int num) {
        int lastDigit = num % 10;
        int firstDigit = num;
        int multiplier = 1;

        while (firstDigit >= 10) {
            firstDigit /= 10;
            multiplier *= 10;
        }

        int remainingNum = num % multiplier - lastDigit;
        return lastDigit * multiplier + remainingNum + firstDigit;
    }

    public static void main(String[] args) {
        System.out.println(reverseFirstAndLast(12345)); // Output: 52341
    }
}
