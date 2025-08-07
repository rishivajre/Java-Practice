public class HollowPyramid {
    public static void main(String[] args) {
        int totalRows = 6;

        for (int i=1; i<=totalRows; i++) {
            for (int j=1; j<=i; j++) {
                if (j==1 || j == i || i == totalRows) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                } System.out.print(" ");
            } System.out.println("");
        }
    }
}
