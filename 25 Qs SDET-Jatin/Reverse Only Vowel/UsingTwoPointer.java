import java.util.Arrays;

public class UsingTwoPointer {
    public static void main(String[] args) {
        // Reverse only Vowels using 2 pointer method
    String input = "Hello";
    char[] inputArray = input.toLowerCase().toCharArray();
    int left =0; int right = inputArray.length-1;
    String vowels = "aeiou";

    while (left<right) {
        if (vowels.indexOf(inputArray[left]) == -1){
        left++;
    } else if (vowels.indexOf(inputArray[right]) == -1) {
        right--;
    } else {
        char temp = inputArray[left];
        inputArray[left] = inputArray[right];
        inputArray[right] = temp;
        left++;
        right--;
    }
    }
    System.out.println(Arrays.toString(inputArray));
    System.out.println(new String(inputArray));
    for (char c : inputArray) {
        System.out.print(c);
    }
    }

}