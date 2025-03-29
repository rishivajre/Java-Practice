import java.util.Scanner;

public class ascendingArraySort {
/** Take an array of numbers as input and 
  * check if it is an array sorted in ascending order.
    Eg : { 1, 2, 4, 7 } is sorted in ascending order.*/
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                isAscending = false;
                break;
            }
        }

        if(isAscending){
            System.out.println("Array is sorted in ascending order.");
        }else{
            System.out.println("Array is not sorted in ascending order. Sorting the array.....");
        
            //sorting via Bubble sort
            for (int i=0; i<numbers.length-1; i++){
                for (int j=0; j<numbers.length-1-i; j++){
                    if(numbers[j]>numbers[j+1]){
                        // Swap numbers[j] and numbers[j + 1]
                        int temp = numbers[j];
                        numbers[j]=numbers[j+1];
                        numbers[j+1]=temp;
                    }
                }
            }

            //printing sorted array
            System.out.println("Sorted array is : ");
            for (int num: numbers){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
