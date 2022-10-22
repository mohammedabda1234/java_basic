package Basic;

import Access_Modifiers.D;

//Write a program for a Single line comment, multi-line and documentation comments
public class Comments {
    public static void main(String[] args) {
        // Single line comment,

        /* This is a comment
        This multi-line
       */

        /**
         * this is
         * documentation comments
         * */

        System.out.println("this call access modifiers ");
        /*
        Also, Access the PROTECTED fields and methods from child class
        located in a different package
        Access the PROTECTED fields and methods from any class in different package
        * */

//        D d = new D();
//        d.a;//can't access field or method
//        d.b;
//        d.sum();
    }
}
