package Exceptions;
//Write a program to create your own exception
public class Custom {

    public static String show(int i) throws MyException {
        if (i == 0){
            throw new MyException("no zeros ");
        }else {
            return "Hello";
        }
    }
    public static void main(String[] args) throws MyException {
        String str = show(0);
        System.out.println(str);
    }
}
