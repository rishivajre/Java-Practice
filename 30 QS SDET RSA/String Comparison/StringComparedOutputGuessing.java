public class StringComparedOutputGuessing {
    public static void main(String[] args) {
        String str1 = "India";
        String str2 = "India";
        String str3 = new String("India");

        System.out.println(str1 == str2);       // true (both point to same string in String Pool)
        System.out.println(str1.equals(str2));  // true (content comparison)
        System.out.println(str1 == str3);       // false (str3 is new object in heap)
        System.out.println(str1.equals(str3));  // true (content is same)
    }
    /*
     * 🤯 Key Points:
     * 
     *          == → reference/address comparison.
     * 
     *          equals() → content comparison.
     * 
     *          String literals go to String Pool, new String() creates new object in Heap.
     */
}
