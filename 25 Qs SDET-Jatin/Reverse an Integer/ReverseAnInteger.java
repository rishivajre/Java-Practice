public class ReverseAnInteger {
    public static void main (String[] args) {
        int num = 125;
        int reverseNumber = 0;
        int lastDigit;

        while (num != 0) {
            lastDigit = num % 10 ; // 125 % 10 = 5
            //check for Overflow and Underflow
            if (reverseNumber > Integer.MAX_VALUE/10 || (reverseNumber == Integer.MAX_VALUE/10 && lastDigit > 7)){
                System.out.println(0);
                System.exit(0);
            }
            if (reverseNumber < Integer.MIN_VALUE/10 || (reverseNumber == Integer.MIN_VALUE/10 && lastDigit <-8)){
                System.out.println(0);
                System.exit(0);
            }
            reverseNumber = reverseNumber * 10 + lastDigit; // 0*10 + 5 = 5
            num /= 10; //125/10 ---> 12.... when num becomes 0 ? While Loop Terminates
        }
        System.out.println(reverseNumber);
    }
}
