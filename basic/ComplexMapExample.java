import java.util.HashMap;
import java.util.LinkedHashMap; // Import LinkedHashMap
import java.util.Map;
import java.util.TreeMap; // Import TreeMap
// 
class Employee {// Employee class with id and name as attributes and constructor to initialize them
    private int id;
    private String name;

    public Employee(int id, String name) {
//         initializing the id and name
        this.id = id;
        this.name = name;
    }

    public int getId() { // getter method to get the id
        return id;
    }

    public String getName() { // getter method to get the name
        return name;
    }

    @Override // overriding the toString method to print the id and name
    public String toString() { // method to return the id and name
        return "Employee{id=" + id + ", name='" + name + "'}";
        // returning the id and name, 
    }
}

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee(122, "John"));
        employeeMap.put(5, new Employee(622, "Jane"));
        employeeMap.put(2, new Employee(333, "Jack"));

        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
// iterating through the map to get the key and value, entry is the key value pair which is an object of Map.Entry
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("-------------------------------------------------");
        //let's have an example of LinkedHashMap
        Map<Integer, Employee> employeeLinkedHashMap = new LinkedHashMap<>();
        employeeLinkedHashMap.put(2, new Employee(122, "John"));
        employeeLinkedHashMap.put(5, new Employee(622, "Jane"));
        employeeLinkedHashMap.put(3, new Employee(333, "Jack"));

        for (Map.Entry<Integer, Employee> entry : employeeLinkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("-------------------------------------------------");
        //let's have an example of TreeMap
        Map<Integer, Employee> employeeTreeMap = new TreeMap<>();
        employeeTreeMap.put(1, new Employee(122, "John"));
        employeeTreeMap.put(5, new Employee(622, "Jane"));
        employeeTreeMap.put(2, new Employee(333, "Jack"));

        for (Map.Entry<Integer, Employee> entry : employeeTreeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


    }
}