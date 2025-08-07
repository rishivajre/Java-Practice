public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int sumUsingForEach =0;
        for (int num : numbers) {
            sumUsingForEach += num;
        }
        System.out.println(sumUsingForEach);
    }
}
