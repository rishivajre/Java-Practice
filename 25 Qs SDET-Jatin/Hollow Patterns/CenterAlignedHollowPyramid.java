public class CenterAlignedHollowPyramid {
    public static void main(String[] args) {
        int totalRows = 5;

        for (int i = 1; i <= totalRows; i++) {
            // Print leading spaces to center-align the pyramid
            for (int space = 1; space <= totalRows - i; space++) {
                System.out.print("  ");
            }

            // Print numbers or spaces inside the pyramid
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == totalRows) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
