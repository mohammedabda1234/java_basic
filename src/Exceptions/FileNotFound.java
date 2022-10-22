package Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//Write a program to generate FileNotFoundException
public class FileNotFound {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
    }
}
