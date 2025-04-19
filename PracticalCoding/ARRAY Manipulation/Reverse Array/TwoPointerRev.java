import java.util.Arrays;

public class TwoPointerRev {    //Reverse array via Two-pointer swap
    public static int[] reverseArray(int[] arr) {
        if (arr == null) return arr;
        int left =0;
        int right = arr.length-1;

        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Reversed Array:" + Arrays.toString(reverseArray(arr)) );
        //System.out.println(Arrays.toString(arr));
    }
    
}

/**
 *🧠 Dry Run:
Iteration	left	right	Array State
Start	0	4	[1, 2, 3, 4, 5]
Step 1	1	3	[5, 2, 3, 4, 1]
Step 2	2	2	[5, 4, 3, 2, 1]
End	left ≥ right	Done ✅	

🧠 Key Concept: Two Pointer Swap
left++ → move toward center from start

right-- → move toward center from end

Swap the elements until left < right


 */