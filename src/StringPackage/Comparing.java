package StringPackage;
//Comparing strings using the methods equals(),
public class Comparing {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Hello World";
        String str2 = new String("Hello");
        String str3 = new String("Hello World");
        System.out.println(str.equals(str2));
        System.out.println(str2.equals(str3));
    }
}
