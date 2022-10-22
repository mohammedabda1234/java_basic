package JAVA_IO;
//Write a program to read text from .txt file using InputStream
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/macuser/Desktop/Untitled document.txt");
        FileInputStream input = new FileInputStream(file);
        int character;
        while ((character = input.read()) != -1) {
            System.out.print((char)character);
        }
      }
    }

