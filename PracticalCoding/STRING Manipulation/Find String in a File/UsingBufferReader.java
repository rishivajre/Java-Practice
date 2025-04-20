import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferReader {    // Problem Statement: Find String in File
    
    public static boolean findStringInFile(String filePath, String target) throws FileNotFoundException{
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains(target.toLowerCase())) return true;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException{
        String filePath = "E:\\test.txt";
        String target = "Java";

        Boolean result = findStringInFile(filePath, target);
        System.out.println(result);
    }
}

/**Ek file diya hai (text file),
 *  aur hume check karna hai ki usme ek specific string (target) exist karti hai ya nahi. 
 * If string milti hai, return true, else false. For example:
 * 
 * File content: "Hello\nWorld\nJava is fun"
    Target: "Java"
    Output: true
 */