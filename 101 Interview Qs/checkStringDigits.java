public class checkStringDigits {
    public static void main(String[] args) {
        String input = "INC1234";

        if (input.startsWith("INC") && input.substring(3).matches("\\d+")) {
            System.out.println("Valid String");
        } else {
            System.out.println("Invalid String");
        }
    }
}
