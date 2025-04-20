import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class UsingStream {
    public static boolean findStringInFile(String filePath, String target) throws IOException {
        try (Stream<String> lines = new Files.lines(Paths.get(filePath))) {
            return lines.anyMatch(line -> line.contains(target));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws FileNotFoundException{
        String filePath = "E:\\test.txt";
        String target = "Java";

        Boolean result = findStringInFile(filePath, target);
        System.out.println(result);
    }
}
