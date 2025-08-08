import java.util.HashSet;
import java.util.Set;

class Employee {
    private int id; 
// this is the unique identifier for the employee to be used in equals and hashCode, so that duplicates can be identified
    private String name; 
// this is not used in equals and hashCode, so that duplicates can be identified based on id

    public Employee(int id, String name) {
// constructor is used to initialize the object, so that it can be added to the set and duplicates can be identified
        this.id = id;
        this.name = name;
    }

    public int getId() {
// getter method is used to get the id of the employee from the object to be used in equals and hashCode, so that duplicates can be identified
        return id;
    }

    public String getName() {
// getter method is used to get the name of the employee from the object to be used in equals and hashCode, so that duplicates can be identified
        return name;
    }

    @Override // this is used to override the default equals method, so that duplicates can be identified based on id
    public boolean equals(Object o) { // this is used to compare the object with another object which is passed as a parameter, which will come from the set
        if (this == o) return true; // this is used to compare the object with itself, if it is same then it will return true
        if (o == null || getClass() != o.getClass()) return false;// this is used to compare the object with null or different class, if it is same then it will return false
        Employee employee = (Employee) o;// this is used to cast the object to Employee class, so that it can be compared with the object
        return id == employee.id;// this is used to compare the id of the object with the id of the employee object, if it is same then it will return true
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class ComplexSetExample {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee(1, "John"));
        employeeSet.add(new Employee(2, "Jane"));
        employeeSet.add(new Employee(3, "John")); // Duplicate based on id, will not be added

        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }
    }
}
