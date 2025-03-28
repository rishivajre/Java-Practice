// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// public class tryCatchFinally {
//     public static void main(String[] args) {
//         int b = 7;
//         int c = 0;

//         try {
//             // Attempt to divide by zero
//             int k = b / c;
//         } catch (ArithmeticException e) {
//             System.out.println("Caught an ArithmeticException: " + e.getMessage());
//         } catch (Exception e) {
//             System.out.println("Caught a general exception: " + e.getMessage());
//         } finally {
//             System.out.println("This block is executed regardless of an exception being thrown or not.");
//         }

//         try {
//             // Attempt to access an invalid array index
//             int[] arr = new int[5];
//             System.out.println(arr[7]);
//         } catch (IndexOutOfBoundsException e) {
//             System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
//         } catch (Exception e) {
//             System.out.println("Caught a general exception: " + e.getMessage());
//         } finally {
//             System.out.println("This block is executed regardless of an exception being thrown or not.");
//         }

//         //one more example of try-catch-finally block in Java on a file operation
//         // try {
//         //     // Attempt to open a file that does not exist
//         //     File file = new File("file.txt");
//         //     Scanner scanner = new Scanner(file); //when file.txt does not exist, this line will throw a FileNotFoundException
//         // } catch (FileNotFoundException e) {
//         //     System.out.println("Caught a FileNotFoundException: " + e.getMessage());
//         // } finally { //it can be used to close resources such as files or network connections and can be used to perform cleanup operations
//         //     //finally block is always executed, regardless of whether an exception is thrown or not
//         //     // and can only be stopped by calling System.exit() or killing the thread or killing the JVM via closing the terminal that runs the program through the command line
//         //     System.out.println("This block is executed regardless of an exception being thrown or not.");
//         // }
//     }
// }

// /* Here are some tricky interview questions that might be asked about try, catch, and finally blocks in Java:

// Questions:
// ## What happens if an exception is thrown in the catch block?
// If an exception is thrown in the catch block, it will propagate up the call stack, and the finally block will still be executed before the method exits.

// ## Can a finally block be skipped?
// Generally, a finally block is always executed. However, it can be skipped if the JVM exits during the try or catch block (e.g., by calling System.exit()), or if the thread executing the try block is interrupted or killed.

// ## What happens if there is a return statement in the try or catch block?
// If there is a return statement in the try or catch block, the finally block will still be executed before the method returns.

// ## Can you have a try block without a catch block?
// Yes, you can have a try block without a catch block, but you must have a finally block. Alternatively, you can have a try block with a catch block and no finally block.

// ## What happens if both the try block and the finally block contain return statements?
// If both the try block and the finally block contain return statements, the return statement in the finally block will override the return statement in the try block.

// ## Can you nest try blocks?
// Yes, you can nest try blocks. Each nested try block can have its own catch and finally blocks.

// ## What is the order of execution for try, catch, and finally blocks?
// The try block is executed first. If an exception occurs, the corresponding catch block is executed. Regardless of whether an exception occurs or not, the finally block is executed last.

// ## What happens if an exception is thrown in the finally block?
// If an exception is thrown in the finally block, it will propagate up the call stack, potentially overriding any exception thrown in the try or catch block.*/