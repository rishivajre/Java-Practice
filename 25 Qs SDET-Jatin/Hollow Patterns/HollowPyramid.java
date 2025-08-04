public class HollowPyramid {

    public static void main(String[] args) {
        int totalRows = 6; // Total number of rows for the pyramid

        // Outer loop to handle each row (1 to totalRows)
        for (int i = 1; i <= totalRows; i++) {

            // Inner loop to handle columns in each row
            for (int j = 1; j <= i; j++) {

                // ✅ Print number at:
                // - the first column (j == 1)
                // - the last column of the row (j == i)
                // - the last row (i == totalRows)

                if (j == 1 || j == i || i == totalRows) {
                    System.out.print(j);          // Print the number
                } else {
                    System.out.print(" ");      // Print space inside the hollow
                }
                System.out.print(" ");          // Add extra space for formatting
            }

            // Move to the next line after each row
            System.out.println("");
        }
    }
}
