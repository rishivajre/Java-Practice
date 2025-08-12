public class FindMissingNumUsingXOR {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};

        int missingNum = 0;
        
        for ( int num : arr) {
            missingNum ^= num;
        }

        for (int i = 1; i<=arr.length+1; i++){
            missingNum ^= i;
        }

        System.out.println(missingNum);
    }
}
