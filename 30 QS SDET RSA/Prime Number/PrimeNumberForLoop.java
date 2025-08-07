public class PrimeNumberForLoop {
    public static void main(String[] args) {
        int num = 110;

        if (num <= 1) {
            System.out.println("Enter a valid Number");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % 2 == 0) {
                    System.out.println("Not a Prime Number");
                } else {
                    System.out.println(num + " is a Prime Number");
                } break;
            }
        }
    }
}
