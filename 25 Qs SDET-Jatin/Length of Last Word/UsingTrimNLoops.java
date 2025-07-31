public class UsingTrimNLoops {
    // Find the length of the last word in a String
    public static void main (String[] args) {
        String str = "Hello World feeling with white spaces";
        // str = str.trim(); // works with or without trim() method
        System.out.println(str);
        
        int count = 0;
        char inputArray[] = str.toCharArray();
        for (int i=inputArray.length-1; i>=0; i--) {
            if (inputArray[i] != ' ') {
                count = count + 1;
            } else {
                if (count > 0) {
                    System.out.println("Length of the Last word is: " + count);
                    break;
                }
            }
        }

    }
}
