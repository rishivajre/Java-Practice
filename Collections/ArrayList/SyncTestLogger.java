import java.util.*;
// Purpose: To demonstrate the use of synchronized collections in Java for thread-safe logging
// Description: This code simulates a scenario where multiple threads log messages concurrently. 
// It uses a synchronized list to ensure that the log messages are stored safely without data corruption.
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


// 🌟 Happy Notes 🌟
// 🚀 This program is a fantastic demonstration of thread-safe logging using synchronized collections in Java!
// 
// 🧵 Key Highlights:
// 1️⃣ **Thread-Safe Logging**: The `Collections.synchronizedList` ensures that the `ArrayList` is safe for concurrent access. 🛡️
// 2️⃣ **Efficient Logging**: The `log` method adds messages to the synchronized list, while `printLogs` safely iterates over it. 📝
// 3️⃣ **Real-World Simulation**: Two threads (`TestCase1` and `TestCase2`) log messages concurrently, mimicking real-world scenarios. 🌍
// 4️⃣ **Thread Coordination**: The `Thread.join()` ensures the main thread waits for both threads to finish before printing logs. ⏳
// 5️⃣ **Explicit Synchronization**: The `synchronized` block in `printLogs` ensures safe iteration over the shared list. 🔒
// 
// 🎯 Why This Matters:
// - This example teaches the importance of synchronization when working with shared resources in multithreaded environments. 🤹‍♂️
// - It’s a simple yet powerful way to understand thread safety and concurrent programming in Java. 💡
// 
// 🐾 Fun Fact:
// - Without synchronization, threads might overwrite each other's data, leading to chaos! This program ensures harmony. 🎶
// 
// 💡 Pro Tip:
// - Always use synchronization when multiple threads access shared resources to avoid data corruption. 🛠️
// 
// 🎉 Keep coding and have fun exploring the world of multithreading! 🚀✨

// 🌟 Happy Notes 🌟
// 🚀 यह प्रोग्राम synchronized collections का उपयोग करके Java में thread-safe logging को demonstrate करता है!
//
// 🧵 मुख्य बातें (Key Highlights):
//
// 1️⃣ Thread-Safe Logging 🛡️
// → `Collections.synchronizedList()` का use करके `ArrayList` को multi-threaded environment के लिए सुरक्षित बनाया गया है।
//
// 2️⃣ Efficient Logging 📝
// → `log()` method हर message को synchronized list में add करता है, और `printLogs()` उन्हें safe तरीके से iterate करता है बिना exception के risk के।
//
// 3️⃣ Real-World Simulation 🌍
// → दो threads (`Test1`, `Test2`) एक साथ अलग-अलग logs डालते हैं — ये parallel test execution या multi-user simulation जैसे scenarios का demo है।
//
// 4️⃣ Thread Coordination ⏳
// → `Thread.join()` main thread को तब तक wait करवाता है जब तक सभी spawned threads finish न कर लें — जिससे output हमेशा पूरी और सही मिले।
//
// 5️⃣ Explicit Synchronization 🔒
// → Iteration करते समय भी thread-safety maintain करने के लिए `synchronized(testLogs)` block का use किया गया है।
//    ❗ List synchronized है, लेकिन उसका iterator नहीं होता!
//
// 🎯 क्यों ज़रूरी है? (Why This Matters):
// - जब एक से ज्यादा threads एक shared resource पर काम कर रहे हों (जैसे logging), तब synchronization जरूरी होता है data integrity बनाए रखने के लिए।
// - ये concept हर उस जगह लागू होता है जहाँ parallel processing हो रही हो — जैसे automation frameworks, load testing tools, या backend services।
//
// 🐾 (Fun Fact):
// - अगर synchronization न हो तो एक thread log डालते वक्त दूसरा thread interfere कर सकता है, जिससे `ConcurrentModificationException` या गलत log entries हो सकती हैं।
//
// 💡 (Pro Tip):
// - अगर आपके पास ज़्यादा reads और कम writes हैं, तो `CopyOnWriteArrayList` एक और smart option हो सकता है!
//
// 🎉 कोडिंग करते रहें और multithreading की दुनिया को explore करने में मज़ा लें! 🚀✨
