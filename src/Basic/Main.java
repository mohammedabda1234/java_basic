package Basic;

public class Main {
    //How to create a class, object, method and its signature
/*
/Everything in Java is associated with classes and objects,
 along with its attributes and method
 To create a class, use the keyword class and Main name of it
 To create an object of Main, specify the class name,
 followed by the object name, and use the keyword new
 */
    double pi = 3.14;
    public void print(String name){//method with one signature
        System.out.println(name);
    }
    public static void main(String[] args) {
        Main obj = new Main();//create object called it obj
        System.out.println(obj.pi);
        obj.print("Ali");//call method

    }
}
