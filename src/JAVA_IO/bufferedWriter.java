package JAVA_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Write text to a .txt file using BufferedWriter
public class bufferedWriter {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("ABC.txt");
        BufferedWriter fwrite = new BufferedWriter(file);
        System.out.println("Buffered Writer start writing :)");
        fwrite.write(69);
        fwrite.write(49);
        fwrite.close();
        System.out.println("Written successfully");
    }
}
