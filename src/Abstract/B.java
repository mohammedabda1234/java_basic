package Abstract;
//Create a subclass for an abstract class. Create an object in
// the child class for the
// abstract class and access the non-abstract methods
public class B extends A{
    @Override
    void print() {
        System.out.println("this is Child class");
    }
    void m(){
        System.out.println("Hi we test abstraction ");
    }
//    A a = new A();// can't access the non-abstract methods

    //Create an instance for the child class in child class and call abstract methods
    B b = new B();
//    b.print(); can't access abstract methods in instance

    //Create an instance for the child class in child class and call non-abstract methods
//    b.m(); can't call non-abstract methods
}
