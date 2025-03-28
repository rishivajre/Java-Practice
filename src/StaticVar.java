public class StaticVar {
    /* 
     * Static variable: This variable is shared across all the objects of the class 
     * and belongs to the class itself.
     */
    static int salary = 100000;
    static int i = 0; // This is a static variable shared across all objects
    int j = 0; // This is an instance variable and is not shared across objects

    // Instance variables: These belong to the object and are not shared across objects.
    String name;
    String city;
    String country;

    // Constructor to initialize instance variables
    StaticVar(String name, String city, String country) {
        this.name = name; // 'this' keyword is used to refer to the current object's instance variables
        this.city = city;
        this.country = country; // these are all local variables
        i++; // This will increment the static variable i, which is shared across all objects whereas j is not shared
        j++; // This will increment the instance variable j, which is not shared across objects
        System.out.println("i: " + i + " j: " + j);
    }

    // Method to print person details
    public void getPersonDetails() {
        System.out.println("Name: " + name + " City: " + city + " Country: " + country + " Salary: " + salary);
    }

    // Static method to change the static variable
    public static void changeSalary(int newSalary) { // here we are changing the static variable salary which is shared across all objects
        salary = newSalary; // This will change the static variable salary for all objects
        //here we declared the salary as static so that it is shared across all objects
    }

    public static void main(String[] args) {
        StaticVar obj = new StaticVar("Ana", "NYC", "USA");
        StaticVar obj1 = new StaticVar("Rama", "Bangalore", "India");

        // Display initial details
        obj.getPersonDetails();
        obj1.getPersonDetails();

        // Change the static variable using a static method
        StaticVar.changeSalary(120000); //here we are changing the static variable salary which is shared across all objects

        // Display details after changing the static variable
        obj.getPersonDetails();
        obj1.getPersonDetails();

        // Create another object to demonstrate that the static variable is shared
        StaticVar obj2 = new StaticVar("Liam", "London", "UK");
        obj2.getPersonDetails();
    }
}