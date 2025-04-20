import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UsingFilesReadString {
    public static boolean findStringInFile (String filePath, String target) throws IOException {
        String content = Files.readString(Paths.get(filePath));
        return content.toLowerCase().contains(target.toLowerCase());
    }

    public static void main(String[] args) {
        String filePath = "E:\\test.txt";
        String target = "java";

        try {
            Boolean result = findStringInFile(filePath, target);
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
