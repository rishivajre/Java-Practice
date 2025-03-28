public class increasingLoop {
    public static void main (String[] args)
    {
        int k =1;
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(k);
                System.out.print("\t");
                k++;

            }
            System.out.println();
        }
        System.out.println("---------Ascending numbers: Starting again from each row");

        for(int m=0;m<=5;m++){
            for(int n=1;n<=m;n++){
                System.out.print(n);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
