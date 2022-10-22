package JAVA_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Read text from a .txt file using BufferedInputStream
public class BufferedInputStream {
    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("file.txt");
        java.io.BufferedInputStream bin = new java.io.BufferedInputStream(fin);
        System.out.println("Number of remaining bytes:" +
                bin.available());
        boolean b=bin.markSupported();
        if (b)
            bin.mark(bin.available());
        bin.skip(4);
        System.out.println("FileContents :");
        int ch;
        while ((ch=bin.read()) != -1)
            System.out.print((char)ch);
        bin.reset();
        while ((ch=bin.read()) != -1)
            System.out.print((char)ch);
        fin.close();

    }
}
