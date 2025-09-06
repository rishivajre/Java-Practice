public class ReplaceAllVowelswithX {

    public static void main(String[] args) {
        String input = "people";

        char[] inputArray = input.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();

        String vowels = "aeiou";

        for (char c : inputArray) {
            if (vowels.indexOf(c) != -1) {
                sb.append("x");
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}