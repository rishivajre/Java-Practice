public class FIndLengthofWord {
    public static void main(String[] args) {
        String input = "Javaf";
        int length = input.length();

        if (length % 2 ==0) {
            System.out.println("Word is evern");
        } else {
            System.out.println("Word is odd length");
        }
    }
}
