public class nestedLoopMultiples {

    public static void main(String[] args) {

        int k = 3;
        int m = 3;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(k);
                System.out.print("\t");
                k = k + m; // k+=m;
            }
            System.out.println();
        }
    }
    /*
     * output:
     * 3
     * 6 9
     * 12 15 18
     */
}
