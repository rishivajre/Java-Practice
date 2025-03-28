public class reverseString {
    public static void main (String args[]){
        String str = "Hello";
        char[] ch = str.toCharArray();
        int n = ch.length;
        char[] temp = new char[n];//
        int j=0;
        for(int i=n-1; i>=0; i--){
            temp[j++] = ch[i];
        }
        for(int i=0; i<j; i++){
            System.out.print(temp[i]);
        }
        System.out.println();System.out.println("----------");

        for (int i=n-1; i>=0; i--){
            System.out.print(ch[i]);
        }
    } // above method is known as reversing a string through array and for loop

}
