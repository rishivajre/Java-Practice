public class MissingNumberXOR {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int n = arr.length+1;

        int xorOfFullRange =0;
        for (int i = 1; i<=n; i++) {
            xorOfFullRange ^= i;
        }

        int xorOfActualRange = 0;
        for (int num : arr) {
            xorOfActualRange ^= num;
        }

        int missingXOR = xorOfActualRange ^ xorOfFullRange;
        System.out.println(missingXOR);
    }
}
