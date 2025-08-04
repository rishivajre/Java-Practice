public class StringBuilderHoPyr {
    public static void main(String[] args) {
        int totalRows = 5;

        for (int i = 1; i<=totalRows; i++) {
            StringBuilder row = new StringBuilder();

            for (int j=1; j<=i; j++) {
                if (j==1 || j==i || i == totalRows) {
                    row.append(j).append(" ");
                } else {
                    row.append("  ");
                }
            }
            System.out.println(row.toString());
        }
    }
}
