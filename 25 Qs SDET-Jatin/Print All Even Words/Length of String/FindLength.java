public class FindLength {

    public static void main(String[] args) {
        String input = "Jafva";
        int length = input.length();

        if (length % 2 == 0) {
            System.out.println("Length of the String is Even: " + length);
        } else {
            System.out.println("Length of the String is Odd: " + length);
        }
    }

}
