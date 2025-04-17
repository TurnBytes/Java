package IOException; //it is just package/folder name for this java file.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAfter {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"))) {
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error: File could not be read!");
            e.printStackTrace();
        }
        finally{
            System.out.println("This block will always execute, regardless of the preceding code's outcome.");
        }
    }
}
