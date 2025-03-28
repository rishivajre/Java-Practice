public class Pyramid123 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("------------------------------");
        // reverse the pyramid
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // pyramid 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        System.out.println("------------------------------");
        for (int i = 1; i <= n; i++) { // here i is the row number and n is the total number of rows
            for (int j = 1; j <= i - 1; j++) { /** this loop is for printing spaces and the number of spaces is equal to
                 i-1 and the number of spaces will decrease as the row number increases, so the number
                // of spaces will be n-i */
                System.out.print(" "); // this is for printing the spaces
            }
            for (int j = 1; j <= n - i + 1; j++) { // this loop is for printing the numbers and the number of numbers is
                                                   // equal to n-i+1 and
                System.out.print(j); // the number of numbers will decrease as the row number increases, so the
                                     // number of numbers will be n-i
            }
            System.out.println(); // this is for printing a new line
        }

        /**
         * lets do one like:
         * 1234
         * 567
         * 89
         * 10
         */
        System.out.println("------------------------------");
        int k = 1; // this is the starting number
        for (int i = 0; i <= 4; i++) { // here "i" is the row number and 4 is the total number of rows
            for (int j = 1; j <= 4 - i; j++) { // this loop is for printing the numbers and the number of numbers is
                                               // equal to 4-i and
                System.out.print(k); // the number of numbers will decrease as the row number increases, so the
                                     // number of numbers will be n-i
                System.out.print("\t"); // this is for giving a tab space between the numbers
                k++; // this is for incrementing the number
            }
            System.out.println(""); // this is for printing a new line
        }

        /**
         * lets do this again but with different method:
         * 1234
         * 567
         * 89
         * 10
         */
        System.out.println("------------------------------");
        int l = 1; // this is the starting number
        for (int i = 1; i <= 4; i++) { // here "i" is the row number and 4 is the total number of rows
            for (int j = 1; j <= 5 - i; j++) { // this loop is for printing the numbers and the number of numbers is
                                               // equal to 5-i and
                System.out.print(l); // the number of numbers will decrease as the row number increases, so the
                                     // number of numbers will be n-i
                l++; // this is for incrementing the number
            }
            System.out.println(""); // this is for printing a new line
        }

        // lets do a Palindrome pyramid
        // 1
        // 121
        // 12321
        // 1234321
        // 123454321
        System.out.println("------------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        // swap two numbers without using a third variable
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);

        // reverse a string
        String str = "Hello";
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversedStr);

        // check if vowel or consonant
        char ch = 'q';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'a') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }

        // make the above code more efficient and dynamic
        char ch1 = 'a';
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        boolean isVowel = false;
        for (char c : vowels) {
            if (ch1 == c) {
                isVowel = true;
                break;
            }
        }
        if (isVowel) {
            System.out.println(ch1 + " is a vowel");
        } else {
            System.out.println(ch1 + " is a consonant");
        }

        // check if vowel is present in a string
        String str1 = "Hello";
        boolean isVowelPresent = false; // this is a flag variable, which is used to check if the vowel is present or
                                        // not, initially it is set to false, which means the vowel is not present in
                                        // the string
        for (int i = 0; i < str1.length(); i++) { // this loop is used to iterate through the string, and check if the
                                                  // vowel is present or not, if the vowel is present then set the flag
                                                  // variable to true and break the loop
            /**
             * above loop is used to iterate through the string, and
             * check if the vowel is present or not, if the vowel is present then set the
             * flag variable to true and break the loop
             */
            char c = str1.charAt(i); // this is used to get the character at the i-th index, and store it in the
                                     // variable c
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { // this is used to check if the character is
                                                                            // a vowel or not
                isVowelPresent = true; // if the character is a vowel then set the flag variable to true
                break; // this is used to break the loop
            }
        }
        if (isVowelPresent) {
            System.out.println("Vowel is present in the string");
        } else {
            System.out.println("Vowel is not present in the string");
        }

        // check if prime number is present in an array
        int[] arr = { 1, 4, 6, 7, 8, 9, 10 };
        boolean isPrimePresent = false;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= num / 2; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                isPrimePresent = true;
                break;
            }
        }
        if (isPrimePresent) {
            System.out.println("Prime number is present in the array");
        } else {
            System.out.println("Prime number is not present in the array");
        }
        // program to check if a number is prime or not
        int num = 7;
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

        // fibonacci series using recursion, 0 1 1 2 3 5 8 13 21 34 55
        int n1 = 0, n2 = 1; // this is used to store the first two numbers of the fibonacci series,
        // and the third number is used to store the sum of the first two numbers, which
        // is used to calculate the next number
        int count = 10;
        System.out.print(n1 + " " + n2);
        printFibonacci(count - 2, n1, n2);
        // this is used to print the fibonacci series,
        // and the count is used to print the number of elements in the series,
        // and the n1 and n2 are used to store the first two numbers of the series
    }

    public static void printFibonacci(int count, int n1, int n2) {
        if (count > 0) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            printFibonacci(count - 1, n2, n3);
        }

        // If list of integers contain only odd numbers in Java

        int[] arr1 = { 1, 3, 5, 7, 9 };
        boolean isAllOdd = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                isAllOdd = false;
                break;
            }
        }
        if (isAllOdd) {
            System.out.println("All numbers are odd");
        } else {
            System.out.println("All numbers are not odd");
        }

        // Give list of integers contain odd or even numbers and print the count of odd
        // and even numbers
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Odd count: " + oddCount);
        System.out.println("Even count: " + evenCount);

        // Count the number of duplicates in an array
        int[] arr3 = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
        int duplicateCount = 0;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = i + 1; j < arr3.length; j++) {
                if (arr3[i] == arr3[j]) {
                    duplicateCount++;
                    break;
                }
            }
        }
        System.out.println("Duplicate count: " + duplicateCount);

    }
}
