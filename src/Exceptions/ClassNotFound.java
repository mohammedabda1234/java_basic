package Exceptions;
//Write a program to generate ClassNotFoundException
public class ClassNotFound {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("fun");
    }
}
