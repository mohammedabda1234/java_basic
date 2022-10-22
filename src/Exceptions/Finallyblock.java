package Exceptions;
//Write a program with finally block
public class Finallyblock {
    public static void main(String[] args) {

        try {
            int a = 10 , b = 5;
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(" catch block ");
            System.out.println(" Dividing by zero ");
        }finally {
            System.out.println(" Finally block ");
        }
    }
}
