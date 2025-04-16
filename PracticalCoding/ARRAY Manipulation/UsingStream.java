import java.util.Arrays;
import java.util.stream.IntStream;

public class UsingStream {
    // Reverse the array using Stream (modern)
    public int[] reverseArray(int[] arr) {
        if(arr == null) return null;

        return IntStream.range(0, arr.length)
                        .map(i -> arr[arr.length-1-i])
                        .toArray();
    }

    public static void main(String[] args) {
        UsingStream rev = new UsingStream();
        int arr[] = {1,2,3,4,5};
        
        int[] reversed = rev.reverseArray(arr);

        System.out.println(Arrays.toString(reversed));
    }
}

/**
 * 
 *✅ In UsingStack (your working example):
java
Copy
Edit
reverse.reverseArray(arr); // modifies 'arr' directly
System.out.println(Arrays.toString(arr));
Why it works?
Because the method:

java
Copy
Edit
public void reverseArray(int[] arr)
is modifying the array in-place — using a Stack and changing the contents of the same array that was passed in.

🔁 This is pass-by-reference (kind of) behavior for arrays:
java
Copy
Edit
for (int i = 0; i < arr.length; i++) {
    arr[i] = stack.pop();  // Directly changes original array
}
✅ So, arr is mutated, and changes are visible in main().

❌ In UsingStream (non-working version):
java
Copy
Edit
rev.reverseArray(arr); // returns new array, but result is ignored
System.out.println(Arrays.toString(arr)); // prints original
Why it fails?
This:

java
Copy
Edit
return IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - 1 - i])
                .toArray();
returns a new reversed array, but you're not storing the result. The original array arr remains unchanged.

Java passes the reference of the array, but reassignment inside method doesn't affect original reference.

🔍 Summary Comparison
Feature	                                UsingStack	            UsingStream
Modifies original array?	        ✅ Yes (in-place)	    ❌ No (returns new array)
Needs to capture return value?	    ❌ No	                ✅ Yes
Method return type	                    void	                 int[]   
Array updated in main()?	        ✅ Yes	                ❌ Not unless returned value is stored
 */