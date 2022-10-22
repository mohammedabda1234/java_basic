package Inheritance;

public class B extends A{
    int x  =30;
    void print(){
        System.out.println("this is sub class B");
    }
    void t(){
        int b = 2;
        System.out.println("here is subclass "+b);
    }
    void k(){
        int a = 1,b = 4;
        System.out.println(a+b);
    }
}
