import java.util.Scanner;
public class nestedLoops {
    public static void main(String[] args){
        //nested loops working:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int k = scanner.nextInt();
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<4-i;j++)
            {
                System.out.print(k);
                System.out.print(" ");
                k++;
            }
            System.out.println();
        }
        System.out.println("---------------REVERSE---------------");
        int m=10;
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<4-i;j++)
            {
                System.out.print(m);
                System.out.print(" ");
                m--;
            }
            System.out.println("");
        }
        scanner.close();
    }
}
