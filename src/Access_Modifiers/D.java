package Access_Modifiers;
//Create a class with PROTECTED fields and methods.
// Access these fields and methods from any other class in the same package.
public class D {
    protected int a = 40;
    protected int b = 30;

    protected int sum(){
        return a+b;
    }
    protected void print(){
        System.out.println("this is protected class");
    }
}
