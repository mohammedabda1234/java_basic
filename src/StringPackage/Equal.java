package StringPackage;
//equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
public class Equal {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Hello";
        String str2 = "Hello World";
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.equalsIgnoreCase(str2));

        System.out.println(str.startsWith("H"));
        System.out.println(str2.startsWith("Hello"));

        System.out.println(str.endsWith("o"));
        System.out.println(str2.endsWith("o"));

        System.out.println(str.compareTo(str1));
        System.out.println(str.compareTo(str2));
    }
}
