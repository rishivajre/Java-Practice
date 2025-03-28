import java.util.*;

//Take an array of names as input from the user and print them on the screen.

public class arrays {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      String[] names = new String[size];

      //input
      for(int i=0; i<size; i++){
         names[i] =sc.next();
      }
      
      for(int i=0; i<size; i++){
         System.out.print(names[i] + " ");
      }
   }
}
