package StringPackage;
//Matching a String Against a Regular Expression With matches()
public class Mach {
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = "world";
        System.out.println(str.matches("(.*)world(.*)"));
        System.out.println(str1.matches("world"));
    }
}
