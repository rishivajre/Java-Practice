public class MissingNumberUsingMath {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6};
        int n = arr.length + 1;

        int expectedSum = (n * (n+1)) / 2;

        int actualSum = 0;
        for (int sum : arr) {
            actualSum += sum;
        }

        int missingNum = expectedSum - actualSum;

        System.out.println(missingNum);
    }
}
