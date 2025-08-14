public class CountVowelsIndexOf {
    public static void main(String[] args) {
        String input = "Peacock";
        String vowels = "aeiou";
        int count = 0;

        for (char c : input.toLowerCase().toCharArray()){
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
