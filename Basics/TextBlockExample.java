public class TextBlockExample {
    public static void main(String[] args) {
        // Creating a text block
        String textBlock = """
                This is a text block.

                It can span multiple lines.
                It preserves the formatting.
                """;

        // Printing the text block
        System.out.println(textBlock);

        // Creating a text block with indentation
        String indentedTextBlock = """
                {
                    "name": "John",
                    "age": 30,
                    "city": "New York"
                }
                """;

        // Printing the indented text block
        System.out.println(indentedTextBlock);

        String specialCharactersTextBlock = """
                This is a text block with special characters:
                - New line: \n
                - Tab: \t(Tab space)
                - Double quote: \"
                - Backslash: \\
                """;

        // Printing the text block with special characters
        System.out.println(specialCharactersTextBlock);
    }
    
    
}