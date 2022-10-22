package JAVA_IO;
// Write a program to read text from .txt file using FileReader
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("f1.txt");
        BufferedReader buffer = new BufferedReader(reader, 16384);
        String line = "";
        while (true) {
            line = buffer.readLine();
            if (line == null)
                break;
            System.out.println(line);
        }

    }
}
