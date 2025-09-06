public class SumOfArrayEle {
    public static void main(String[] args) {
        int[] numbers = { 1, 20, 40, 50 };

        int sumIndex = 0;
        for (int i = 0; i <= numbers.length-1; i++) {
            sumIndex += numbers[i];
        }
        System.out.println(sumIndex);

        // mehtod 02 F
        int sumForEach = 0;
        for (int num : numbers) {
            sumForEach += num;
        }
        System.out.println(sumForEach);
    }
}
