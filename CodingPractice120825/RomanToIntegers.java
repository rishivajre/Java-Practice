import java.util.HashMap;

public class RomanToIntegers {

    public static void main(String[] args) {
        String input = "xI";
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);

        int result = 0;
        int prevValue = 0;

        for (int i = input.length()-1; i>=0; i--) {
            char c = input.toUpperCase().charAt(i);
            int currentValue = romanMap.get(c);

            if (currentValue >= prevValue) {
                result = result + currentValue;
            } else {
                result = result - currentValue;
            }
            prevValue = currentValue;
        }

        System.out.println(result);

    }
}