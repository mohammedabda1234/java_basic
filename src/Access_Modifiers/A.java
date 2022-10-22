package Access_Modifiers;
//Create a class with PRIVATE fields, private method and
// a main method. Print the fields in main
// method. Call the private method in main method.
public class A {
    private int a = 20;
    private int b = 30;
    private int c;

    private int sum(){
        c = a + b;
        return c;
    }

    private int sub(){
        c = b - a;
        return c;
    }
    public static void main(String[] args) {
      A a = new A();
      a.sub();
      a.sum();
        System.out.println(a.a);
        System.out.println(a.b);

        C c = new C();
//        c.a;can't access fields
//        c.b;
        c.sum();//can access methods
        c.multi();

        D d = new D();
//        d.a;//can't access fields
//        d.b;
        d.print();//can access methods
        d.sum();

        E e = new E();
//        e.a;//can't access fields
//        e.d;

        System.out.println(e.sum());
        e.print();
    }
}
