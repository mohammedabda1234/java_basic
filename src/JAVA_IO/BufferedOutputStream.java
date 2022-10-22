package JAVA_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Write text to a .txt file using BufferedOutputStream
public class BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("f1.txt");
        java.io.BufferedOutputStream bout = new java.io.BufferedOutputStream(fout);
        for(int i = 65; i < 75; i++)
        {
            bout.write(i);
        }
        byte b[] = { 75, 76, 77, 78, 79, 80 };
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
    }
}
