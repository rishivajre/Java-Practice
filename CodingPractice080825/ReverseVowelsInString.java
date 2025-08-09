public class ReverseVowelsInString {
    public static void main(String[] args) {
        String input = "peacock";
        char[] inputArray = input.toLowerCase().toCharArray();
        int left = 0;
        int right = inputArray.length - 1;
        String vowels = "aeiou";

        while (left < right) {
            if (vowels.indexOf(inputArray[left]) ==-1) {
                left++;
            } else if (vowels.indexOf(inputArray[right]) ==-1) {
                right--;
            } else {
                char temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(inputArray));
    }
}
