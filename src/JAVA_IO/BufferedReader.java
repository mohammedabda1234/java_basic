package JAVA_IO;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Read text from a .txt file using BufferedReader
public class BufferedReader {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("file.txt");
        java.io.BufferedReader br = new java.io.BufferedReader(fr);
        char c[] = new char[20];
        if (br.markSupported()) {
            br.mark(100);
        }
        br.skip(8);
        if (br.ready()) {
            System.out.println(br.readLine());
            br.read(c);
            for (int i = 0; i < 20; i++) {
                System.out.print(c[i]);
            }
            System.out.println();
            br.reset();
            for (int i = 0; i < 8; i++) {
                System.out.print((char)br.read());
            }
        }
    }
}
