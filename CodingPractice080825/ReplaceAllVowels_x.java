public class ReplaceAllVowels_x {
    public static void main(String[] args) {
        String input = "Peacock";
        char[] inputArray = input.toLowerCase().toCharArray();

        StringBuilder sb = new StringBuilder();
        String vowels = "aeiou";

        for (char c: inputArray) {
            if (vowels.indexOf(c) != -1) {
                sb.append('x');
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
