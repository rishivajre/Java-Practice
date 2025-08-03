import java.util.Arrays;
// ✅ Goal: Replace all vowels in a string with the character 'x'
public class UsingCharArrSB {
    public static void main(String[] args) {
        
        String input = "People";
        // Convert to lowercase for consistent vowel checking
        char[] inputArray = input.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder(); // StringBuilder is used for efficient string mutation
        
        String vowels = "aeiou"; // Define vowels for easy lookup
    
        // Loop through each character in the array
        for (char c : inputArray) {
            if (vowels.indexOf(c) != -1) { // vowel.indexOf(c) returns -1 if the character is not found 
                sb.append('x'); // Replace vowel with 'x' on that character position
            } else {
                sb.append(c);   // Keep consonants as is
            }
        }

        // Output the final result
        System.out.println("Replaced String: " + sb.toString());
        System.out.println(new String(sb));
    }
}
