package JAVA_IO;
//Write a program to write text to .txt file using FileWriter
import java.io.FileWriter;
import java.io.IOException;

// Write a program to write text to .txt file using FileWriter
public class fileWriter {
    public static void main(String[] args) throws IOException {
        String str = "ABC";
        FileWriter fw = new FileWriter("/Users/macuser/Desktop/Untitled document.txt");
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
        System.out.println("Successfully written");
        fw.close();
    }
}
