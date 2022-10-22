package Exceptions;
//Write a program to generate Arithmetic Exception without exception handling
//Handle the Arithmetic exception using try-catch block
public class Arithmetic {

    public static void main(String[] args) {
       try {
           int a = 10;
           int b = 0;
           int c = a/b;//cannot divide by zero
           System.out.println(c);
       }catch (ArithmeticException e){
           System.out.println("Can't divide a number by 0");
       }
    }
}
