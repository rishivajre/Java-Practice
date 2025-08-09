import java.util.Arrays;

public class ReverseOnlyLettersInString {
    public static void main(String[] args) {
        String input = "1K2al45a";
        char[] inputArray = input.toLowerCase().toCharArray();
        int left = 0;
        int right = inputArray.length - 1;

        while (left < right) {
            if (!Character.isAlphabetic(inputArray[left])){
                left++;
            } else if (!Character.isAlphabetic(inputArray[right])){
                right--;
            }
            else {
                char temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(inputArray));
        System.out.println(new String(inputArray));
    }
}
