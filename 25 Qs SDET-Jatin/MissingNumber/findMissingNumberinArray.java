import java.nio.channels.Pipe.SourceChannel;

public class findMissingNumberinArray {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6};
        int totalNumbers = array.length+1;
        int sumOfArray = (totalNumbers* (totalNumbers+1))/2;
        System.out.println(sumOfArray);

        int sum = 0;

        // for (int i=0; i<array.length; i++) {
        //     sum = sum + array[i];
        // }

        for (int num : array) {
            sum += num;
        }

        System.out.println(sum);
        System.out.println("The Missing Number is: " + (sumOfArray-sum));
    }
}
