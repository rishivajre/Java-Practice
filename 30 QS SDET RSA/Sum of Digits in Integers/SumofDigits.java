public class SumofDigits {
    public static void main(String[] args) {
        int sum = 0;
        int num = 12345; // 15

        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }

        System.out.println(sum);
    }
}
