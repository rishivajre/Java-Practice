public class LengthOfLastWord {
    public static void main(String[] args) {
        String input = " Help me fing a Job..";
        input = input.trim(); // white spaces removed from start and end
        System.out.println(input);
        int count = 0;
        char[] inputArray = input.toCharArray();
        StringBuffer lastWord = new StringBuffer();

        for (int i = inputArray.length - 1; i >= 0; i--) {
            if (inputArray[i] != ' ') {
                count++;
                lastWord = lastWord.insert(0, inputArray[i]); // if we do sb.append() then it will reverse : boJ 
            } else {
                if (count > 0){
                    System.out.println(lastWord + " Length: "+ count);
                    break;
                } 
            }
        }

    }
}
