package StringPackage;
//Extract a string using Substring
public class SubString {
    public static void main(String[] args) {
        String str = "Hello World";
        String sub = str.substring(0);//start from 0 to end of character
        System.out.println(sub);
        String sub1 = str.substring(3,9);
        System.out.println(sub1);
    }
}
