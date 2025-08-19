public class UsingLoop {
    static void maxConsecutiveOnes(int[] arr) {
        int count =0;
        int max =0;

        for (int num : arr) {
            count = (num == 1) ? count + 1 : 0;
            max = Math.max(count, max);
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = {1,0,11,0,1,1,1,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1,1,1,3,6};
        maxConsecutiveOnes(arr);
    }
}
