import java.util.Arrays;

public class UsingTwoPointer { // Reverse Only Letters
    public static void main(String[] args) {
        String input = "1abc3";
        
        // Convert the string to a char array for easy in-place modification
        char[] inputArray = input.toCharArray();

        // Two pointers from both ends of the array
        int left = 0;
        int right = inputArray.length - 1;

        // Loop until both pointers meet
        while (left < right) {

            // If the left character is not a letter, skip it
            if (!Character.isLetter(inputArray[left])) {
                left++;
            }
            // If the right character is not a letter, skip it
            else if (!Character.isLetter(inputArray[right])) {
                right--;
            }
            // If both are letters, swap them
            else {
                char temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;
            }
        }

        // Printing the final char array using different ways
        System.out.println("Array view: " + Arrays.toString(inputArray));
        System.out.println("String view: " + new String(inputArray));
        System.out.print("Char-by-char: ");
        for (char c : inputArray) {
            System.out.print(c);
        }
    }
}
