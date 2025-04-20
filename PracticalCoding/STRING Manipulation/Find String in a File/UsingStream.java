import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class UsingStream {
    public static boolean findStringInFile(String filePath, String target) throws IOException {
        try(Stream<String> lines = Files.lines(Paths.get(filePath))) {
            return lines.anyMatch(line -> line.toLowerCase().contains(target.toLowerCase()));          
        } 
    }

    public static void main(String[] args) {
        String filePath = "E:\\test.txt";
        String target = "java";

        try {
            Boolean result = findStringInFile(filePath, target);
            System.out.println(result);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
