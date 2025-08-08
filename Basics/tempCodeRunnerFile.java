import java.util.HashMap;
import java.util.Map;
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
        employeeMap.put(3, new Employee(333, "Jack"));

        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
// iterating through the map to get the key and value, entry is the key value pair which is an object of Map.Entry
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        //let's get the employee with id 622
        Employee employee = employeeMap.get(2);
        System.out.println("Employee with id 622: " + employee);
    }
}