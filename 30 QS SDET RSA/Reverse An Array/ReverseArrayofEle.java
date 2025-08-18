public class ReverseArrayofEle {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
        int left = 0;
        int right = arr.length-1;
         
        while(left<right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
} 