package Operators;

public class AddAndSub {
    //Write a method for increment and decrement operators(++, --)
    public void operator(int n){
        System.out.println("++ "+ ++n);
        System.out.println("-- "+ --n);
    }
    public static void main(String[] args) {
        AddAndSub o = new AddAndSub();
        o.operator(8);
    }
}
