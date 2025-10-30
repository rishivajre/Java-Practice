public class ReverseNumberUsingStrBuilder {
    public static int reverse(int num) {
        StringBuilder sb = new StringBuilder();
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);

        sb.append(num);
        sb.reverse();

        try{
            return Integer.parseInt(sb.toString()) * sign;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        int number = 123;
        int reversedNumber = reverse(number);
        System.out.println("Example 01 Reversed Number: " + reversedNumber); 

    }
}
