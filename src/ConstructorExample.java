public class ConstructorExample {
    private String name;
    private int age;
    private String city;

    // Complex constructor
    public ConstructorExample(String name, int age, String city) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than zero");
        }
        if (city == null || city.isEmpty()) {
            throw new IllegalArgumentException("City cannot be null or empty");
        }

        this.name = name;
        this.age = age;
        this.city = city;

        System.out.println("ConstructorExample object created with name: " + name + ", age: " + age + ", city: " + city);
    }

    // Simple main method
    public static void main(String[] args) {
        try {
            ConstructorExample obj = new ConstructorExample("John", 30, "New York");
            System.out.println(obj);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "ConstructorExample{name='" + name + "', age=" + age + ", city='" + city + "'}";
    }
}