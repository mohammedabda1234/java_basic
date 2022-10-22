package JAVA_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//Write a program to write text to .txt file using OutputStream
public class OutputStream {
    public static void main(String[] args) throws IOException {

        String fileContent = "Welcome to my world ";
        FileOutputStream outputStream = null;
        outputStream = new FileOutputStream("file.txt");
        byte[] strToBytes = fileContent.getBytes();
        outputStream.write(strToBytes);

    }
}
