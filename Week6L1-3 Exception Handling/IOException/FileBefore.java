package IOException;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileBefore {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
        String line = reader.readLine(); // Will crash if file doesn't exist
        System.out.println(line);
        reader.close();
    }
}
