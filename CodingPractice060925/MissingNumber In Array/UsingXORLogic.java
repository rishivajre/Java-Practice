public class UsingXORLogic {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6 };
        int n = arr.length + 1; // expected

        int xorFullRange = 0;
        for (int i = 1; i <= n; i++) {
            xorFullRange ^= i;
        }
        System.out.println(xorFullRange);

        int xorArray =0;
        for (int num : arr) {
            xorArray ^= num;
        }
        System.out.println(xorArray);

        int missingNumber = xorArray ^ xorFullRange;

        System.out.println(missingNumber);
    }

}
