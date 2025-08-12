public class CountCapitalWordsUsingLoop {
    public static void main(String[] args) {
        String input = "Avengers Infinity War";
        int counter = 0;
        
        // Count Each Capitalized Letter A - Z
        for (char c : input.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                counter++;
            }
        }
        System.out.println("Capitalized Letter Count: " + counter);

        // Count Each Capitalized Word
        int count = 0;
        for (String words : input.split("\\s+")){
            if (!words.isEmpty() && Character.isUpperCase(words.charAt(0))) {
                count++;
            }
        }
        System.out.println("Capitalizrd Word Count: " + count);
    }
}
