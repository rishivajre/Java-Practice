import java.util.HashMap;

//Qs: To convert Roman Numbers into Integers
public class ConvertRomanNumbers {
    public static void main(String[] args) {
        String input = "VII";
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        // String
        int result = 0;
        int prevValue = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            int currentValue = romanMap.get(c);

            if (currentValue >= prevValue) { 
                result = result + currentValue; // If value >= prev → add ➕
            } else {
                result = result - currentValue; // Else → subtract ➖
            }
            prevValue = currentValue;   //Update prev
        }
        System.out.println(result);
    }
}

/* 🪄 Final Flow (in Pseudocode)
 * 
 * 1. Map each Roman char to its int value --> in HashMap.put
 * 2. Start from the end of the string
 * 3. For each character:
                        * a. Get its value
                        * b. If value >= prev → add
                        * c. Else → subtract
                        * d. Update prev
 * 
 */