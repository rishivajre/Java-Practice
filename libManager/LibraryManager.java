import library.*; //Importing all classes from the library package

public class LibraryManager {
    public static void main(String[] args) {

        //create a new book object
        Book book1 = new Book();
        Book book2 = new Book();

        //Display book details
        book1.displayDetails();
        book2.displayDetails();
    }
}
