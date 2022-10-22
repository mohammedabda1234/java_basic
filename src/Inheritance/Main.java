package Inheritance;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.one();
        a.two();

        b.t();
        b.k();

        c.r();
        c.m();

        a = new B();
        System.out.println(a.x);
        a.print();

        a = new C();
        System.out.println(a.x);
        a.print();
//Data member of class A will be accessed
    }
}
