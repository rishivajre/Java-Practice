import java.util.HashMap;

public class RomanNumberConversion {
    public static void main(String[] args) {
        String input = "iX";
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.toUpperCase().charAt(i);
            int currValue = romanMap.get(c);

            if (currValue >= prevValue) {
                result += currValue;
            } else {
                result -= currValue; // If value >= prev → add ➕
            }
            prevValue = currValue; // Update prev
        }
        System.out.println(result);
    }
}
