package StringPackage;
//Converting integer objects to Strings
import java.text.DecimalFormat;
import java.util.*;
public class Object {
    public static void main(String[] args) {
        int n = 12345;
        DecimalFormat df = new DecimalFormat("#");
        String str = df.format(n);
        System.out.println(str);

        StringBuilder sb = new StringBuilder();
        sb.append(n);
        String s = sb.toString();
        System.out.println(s);
    }
}
