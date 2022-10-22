package Exceptions;
//Write a program to throw exception with your own message
public class Message {
    public static void adult(int age){
        if (age < 14){
            throw new ArithmeticException("you not adult");
        }else
            System.out.println(" your are adult");
    }
    public static void main(String[] args) {
        adult(12);
    }
}
