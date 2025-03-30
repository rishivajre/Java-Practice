public class stringBuilderBasics {
    // 
    public static void main(String[] args){
        // StringBuilder is mutable, meaning it can be changed after creation.
        // String is immutable, meaning it cannot be changed after creation.

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        
        // Append a string to the StringBuilder
        sb.append(" World!");
        System.out.println(sb); // Output: HelloWorld!

        // Insert a string at a specific index
        sb.insert(5, ","); // Insert a comma at index 5
        System.out.println(sb);

        // Delete a substring from the StringBuilder
        sb.delete(5,6); // Delete the comma at index 5
        System.out.println(sb);

        // Reverse the StringBuilder
        sb.reverse();
        System.out.println(sb);

        // Convert StringBuilder to String
        String str = sb.toString();
        System.out.println(str);

    }
}
