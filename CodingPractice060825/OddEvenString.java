public class OddEvenString {
    public static void main(String[] args) {
        String input = "Jafva";

        int length = input.length();

        if (length % 2 == 0) {
            System.out.println("String is even having length: " + length );
        } else {
            System.out.println("String is odd having length: " + length);
        }
    }
}
