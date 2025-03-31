public class vowelPresent {
    // Check if a Vowel is present in a string

    public static boolean containsVowel(String str){
        // Check if the string contains any vowels (a, e, i, o, u)
        // Convert the string to lowercase to make the check case-insensitive
        // Use regex to check for vowels
        return str.toLowerCase().matches(".*[aeiou].*");

        // OR || Alternatively, you can use the following method:
        // return str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i") || str.toLowerCase().contains("o") || str.toLowerCase().contains("u");
    }
    public static void main(String[] args){

        System.out.println(containsVowel("Hello"));
        System.out.println(containsVowel("Hll"));
        System.out.println(containsVowel("aeio2u"));
    }
}
