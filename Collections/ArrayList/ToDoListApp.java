import java.util.*;

public class ToDoListApp {
    public static void main(String[] args) {

        List<String> tasks = new ArrayList<>(); // Create an ArrayList to store tasks
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        while(true) {
            System.out.println(" \n1. Add Task\n2. View Tasks\n3. Remove Task\n4. Exit");
            System.out.print("\nChoose: ");
            int choice = sc.nextInt(); // Read user choice
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1: //Add Task
                    System.out.print("Enter task: ");
                    String task = sc.nextLine(); // Read the task from user input
                    tasks.add(task); // Add the task to the list
                    break;
                case 2: // View Tasks
                    if (tasks.isEmpty()) { // Check if the list is empty
                        System.out.println("\nNo tasks entered yet!"); // Print a message if no tasks are present
                    } else {
                        System.out.print("Your Tasks: "); // Print a message if tasks are present
                    }
                    for (int i=0; i<tasks.size(); i++) { // Loop through the tasks
                        System.out.print((i+1) + ". " + tasks.get(i)); // Print each task with its index;
                        System.out.println();
                    }
                    break;
                case 3: // Remove Task
                    System.out.print("Enter task number to remove: ");
                    int num = sc.nextInt(); // Read the task num to remove
                    if (num > 0 && num <= tasks.size()) { // check it the number is valid
                        tasks.remove(num - 1); // Remove the task from the list
                    } else {
                        System.out.println("Invalid number!");
                    }
                    break;
                case 4: //Exit
                    System.out.println(" Bye!"); // Exit the program
                    sc.close(); // Close the Scanner
                    return; // Exit the main method
                default: // Invalid choice
                    System.out.println("Invalid choice! Please try again."); // Print an error message
                    break;
            }
        }
    }
}
