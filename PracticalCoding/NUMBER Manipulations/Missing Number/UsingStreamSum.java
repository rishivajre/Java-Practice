import java.util.Arrays;

public class UsingStreamSum { // Approach 1: Sum Formula (Simple)

    public int missingNum(int[] arr, int n) {
        int expectedSum = n * (n+1)/2;
        int actualSum = Arrays.stream(arr).sum();
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = 5;

        UsingStreamSum mN = new UsingStreamSum();
        int missingNum = mN.missingNum(arr, n);

        System.out.println(missingNum);
    }
}
