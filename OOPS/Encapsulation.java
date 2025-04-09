// Example of Encapsulation
public class Encapsulation {
  // Private fields (data hiding)
  private String name;
  private int age;

  // Public getter and setter methods (controlled access)
  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public int getAge() {
      return age;
  }

  public void setAge(int age) {
      if (age > 0) { // Adding validation to ensure data integrity
          this.age = age;
      } else {
          System.out.println("Age must be positive!");
      }
  }

  public static void main(String[] args) {
      Encapsulation person = new Encapsulation();
      person.setName("John");
      person.setAge(25);

      System.out.println("Name: " + person.getName());
      System.out.println("Age: " + person.getAge());
  }
}

// Example of Abstraction
abstract class Animal {
  // Abstract method (no implementation)
  public abstract void makeSound();

  // Concrete method (with implementation)
  public void eat() {
      System.out.println("This animal eats food.");
  }
}

class Dog extends Animal {
  @Override
  public void makeSound() {
      System.out.println("Dog barks: Woof Woof!");
  }
}

class Cat extends Animal {
  @Override
  public void makeSound() {
      System.out.println("Cat meows: Meow Meow!");
  }
}

class AbstractionExample {
  public static void main(String[] args) {
      Animal dog = new Dog();
      dog.makeSound(); // Output: Dog barks: Woof Woof!
      dog.eat();       // Output: This animal eats food.

      Animal cat = new Cat();
      cat.makeSound(); // Output: Cat meows: Meow Meow!
      cat.eat();       // Output: This animal eats food.
  }
}

// Encapsulation is a fundamental concept in OOP that restricts direct access to an object's data and methods.
    // It allows for controlled access through public methods, ensuring data integrity and security.

    //Data hiding is the provess of protecting members of a class
    // from unintended changes by restricting access to them.
    // It is achieved through access modifiers (private, protected, public) and encapsulation techniques.

// Absrtaction is hiding the implementation details and showing only the useful parts of the user object.
// It is achieved through abstract classes and interfaces in Java. 
// Abstraction allows for a simplified view of complex systems, 
  // making it easier to understand and use them.
// It also promotes code reusability and flexibility 
  // by allowing different implementations of the same interface or abstract class.