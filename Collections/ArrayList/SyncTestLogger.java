import java.util.*;

public class SyncTestLogger {
    
        // Thread-safe list for storing logs
        private static List<String> testLogs = Collections.synchronizedList(new ArrayList<>());

        public static void log(String message) {
            // Adding a log message to the synchronized list            
            testLogs.add(message);
        }

        public static void printLogs() {
            synchronized (testLogs) {
                for (String log : testLogs) {
                    System.out.println(log); // Printing each log message
                }
            }
        }
        //Simulating parallel logging from multiple threads (test runs)
        public static void main(String[] args) throws InterruptedException{
            Runnable testCase = () -> {
                String threadName = Thread.currentThread().getName();
                for (int i=1; i<=3; i++) {
                    log(threadName + " - Step " + i);
                }
            };

            Thread test1 = new Thread(testCase, "TestCase1");
            Thread test2 = new Thread(testCase, "TestCasae2");

            test1.start(); // Starting the first thread
            test2.start(); // Starting the second thread

            test1.join(); // Waiting for the first thread to finish
            test2.join(); // Waiting for the second thread to finish

            System.out.println("\n--- Test Logs ---");
            printLogs(); // Printing all the logs after both threads have finished;
        }
}
