public class NumericToChar {

    public static void ConvertNumericToChar(String input) {
        for (int i=0; i<input.length(); i++) {
            if (Character.isAlphabetic(input.charAt(i))){
                System.out.print(input.charAt(i));
            } else {
                int a = Character.getNumericValue(input.charAt(i));
                for (int j =1; j<a; j++) {
                    System.out.print(input.charAt(i - 1));
                }
            }
        }
    }
    public static void main(String[] args) {
        String input = "A2B3c6";

       ConvertNumericToChar(input);
    }
}