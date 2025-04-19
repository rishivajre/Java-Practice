public class UsingXOR {

    public static int missingNum(int[] arr, int n) {
        int xor1 = 0;
        int xor2 = 0;

        for (int i=1; i<=n; i++) xor1 ^= 1;
        for (int num : arr) xor2 ^=num;
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n =5;

        System.out.println(missingNum(arr, n));
    }
    
}
