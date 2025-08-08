public class RemoveDuplicatesFromArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,2,3,4,5,6,7,6,8,9,10,9}; // here we are creating an array with duplicate elements
        int n = arr.length; // here n is the length of the array, because we need to know the length of the array and it starts from 1
        int[] temp = new int[n];    /* Here we are creating a new array to store the unique elements & the length of the array is n, 
                                    how? because we need to store the unique elements only in such a way that 
                                    the length of the array is equal to the length of the original array, so that we can print the unique elements in the array.
                                    how? by using the for loop when? when the condition is true*/ 
        int j=0;
        for(int i=0; i<n-1; i++){   // here n-1 is used because we need to compare the last element with the previous element
            if(arr[i] != arr[i+1]){ /* here we are comparing the current element with the next element, 
                                    where the condition is if the current element is not equal to the next element, 
                                    then the current element is stored in the temp array
                                    & the index of the temp array is incremented by 1*/
                temp[j++] = arr[i]; /* Here we are storing the unique elements in the temp array, 
                the index of the temp array is incremented by 1 so that the next element can be stored in the next index.*/
            }
        } // here we are storing the last element of the array in the temp array why? 
        // because the last element of the array is not compared with the previous element
        temp[j++] = arr[n-1]; //how? by using the for loop when? when the condition is false, then the last element of the array is stored in the temp array
        for(int i=0; i<j; i++){ // here j is the length of the temp array, because we need to print the unique elements in the array
            System.out.print(temp[i] + " "); // here we are printing the unique elements in the array, the elements are separated by space & the elements are printed in the same line
        }

        // print the duplicate elements in an array
        System.out.println();
        for(int i=0; i<n-1; i++){ // here n-1 is used because we need to compare the last element with the previous element
            if(arr[i] == arr[i+1]){ // here we are comparing the current element with the next element, if the condition is true then the current element is printed
                System.out.print(arr[i] + " "); // here we are printing the duplicate elements in the array, the elements are separated by space & the elements are printed in the same line
            }
        } // here we are printing the last element of the array, because the last element of the array is not compared with the previous element
    }

    
}
