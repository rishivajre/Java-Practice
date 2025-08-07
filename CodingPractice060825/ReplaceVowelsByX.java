public class ReplaceVowelsByX {

    public static void main(String[] args) {
        String input = "Peacock";
        char[] inputArray = input.toLowerCase().toCharArray();
        String vowels = "aeiou";

        StringBuilder sb = new StringBuilder();

        for (char c : inputArray) {
            if (vowels.indexOf(c) != -1) {
                sb.append("x");
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        System.out.println(new String(sb));
    }
}