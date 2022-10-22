package Interfaces;
//Create two interfaces with one method each.
// Implement these two interfaces in one class.
public interface Interface2 {
    void print();
}
class M implements Interface2,Interface1{
    @Override
    public void print() {
        System.out.println("here interface");
    }

    @Override
    public void fun() {
        System.out.println("hello");
    }
}