package Exceptions;
//Write a program to generate StringIndexOutOfBoundsException
public class StringIndexOutOfBounds {
    public static void main(String[] args) {

        String str = "Hello world ";
        char ch = str.charAt(15);
        System.out.println(ch);

    }
}
