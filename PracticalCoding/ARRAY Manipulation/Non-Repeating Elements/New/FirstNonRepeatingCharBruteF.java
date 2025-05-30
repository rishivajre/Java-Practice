public class FirstNonRepeatingCharBruteF {

    public static int findFirstNonRepeating(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            int count = 0;
            for (int j=0; j<n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count == 1) {
                return arr[i];
            }
        }
        return -1;        
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 5, 3, 5, -5, 7, 8};
        int result = findFirstNonRepeating(arr);
        if (result != -1) {
            System.out.println("First Non-Repeating char: " + result);
        } else {
            System.out.println("No non repeating ele found!!?");
        }

    }
}