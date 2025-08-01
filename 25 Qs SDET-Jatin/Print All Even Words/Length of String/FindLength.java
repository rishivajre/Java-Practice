public class FindLength {

    public static void main(String[] args) {
        String input = "Jafva";
        int length = input.length();

        if (length % 2 == 0) {
            System.out.println("String length is Even i.e.: " + length);
        } else {
            System.out.println("String length is Odd i.e.: " + length);
        }
    }

}
