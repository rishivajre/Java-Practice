import java.util.*;
// Spiral Matrix Printing in Java
public class spiralMatrxiPrinting {
    // Print the spiral order matrix as output for a given matrix of numbers.
    
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();


      int matrix[][] = new int[n][m];
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }


      System.out.println("The Spiral Order Matrix is : ");
      int rowStart = 0;
      int rowEnd = n-1;
      int colStart = 0;
      int colEnd = m-1;


      //To print spiral order matrix
      while(rowStart <= rowEnd && colStart <= colEnd) {
        // Step 1: Top row (left to right)
        for(int col=colStart; col<=colEnd; col++) {
            System.out.print(matrix[rowStart][col] + " ");
        }
        rowStart++;
    
        // Step 2: Right column (top to bottom)
        for(int row=rowStart; row<=rowEnd; row++) {
            System.out.print(matrix[row][colEnd] +" ");
        }
        colEnd--;
    
        // Step 3: Bottom row (right to left)
        for(int col=colEnd; col>=colStart; col--) {
            System.out.print(matrix[rowEnd][col] + " ");
        }
        rowEnd--;
    
        // Step 4: Left column (bottom to top)
        for(int row=rowEnd; row>=rowStart; row--) {
            System.out.print(matrix[row][colStart] + " ");
        }
        colStart++;
    
        System.out.println(); // New line for clarity
    }
   }
}

// Time Complexity: O(n*m) where n is the number of rows and m is the number of columns in the matrix.
// Space Complexity: O(1) as we are not using any extra space except for the input matrix.
