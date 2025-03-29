import java.util.Scanner;

public class searchInMatrix2D {
    // Searching for an element x in a matrix.
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the size of cols: ");
        int cols = sc.nextInt();

        int[][] numbers = new int [rows][cols];

        // Input: rows
        for (int i=0; i<rows; i++){
            // Input: columns
            for (int j=0; j<cols; j++){
                System.out.print("Enter the element at ["+i+"]["+j+"] : ");
                numbers[i][j] = sc.nextInt();
            }
        }
        // Input: element to search
        System.out.print("Enter the element to search: ");
        int x = sc.nextInt();

        // Searching for the element
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                // comparing the element with the matrix elements
                if (numbers[i][j]==x){
                    System.out.print("Element found at ["+i+"]["+j+"]");
                    break;
                }
            }
        }
    }
}
