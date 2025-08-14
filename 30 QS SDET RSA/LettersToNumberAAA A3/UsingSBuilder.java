public class UsingSBuilder { // a2b2c3 => aabbccc
    public static void convertNumToChar(String input) {
        
        for (int i = 0; i < input.length();) {
            char ch = input.charAt(i++);
            StringBuilder num = new StringBuilder();

            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                num.append(input.charAt(i++));
            }

            int count = Integer.parseInt(num.toString());
            for (int j =0; j<count; j++) {
                System.out.print(ch);
            }
        }
    }

    public static void main(String[] args) {
        convertNumToChar("A2m2");
    }
}
