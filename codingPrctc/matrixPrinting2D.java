import java.util.Scanner;

public class matrixPrinting2D {
    // Taking a matrix as an input and printing its elements.
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the size of cols: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input: rows
        for(int i=0; i<rows; i++){
            // input: columns
            for (int j=0;j<cols; j++){
                System.out.print("Enter the element at ["+i+"]["+j+"] : ");
                // input: elements of the matrix
                numbers [i][j] = sc.nextInt();
            }
        }
        // printing the matrix
        System.out.println("The matrix is : ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
}
}