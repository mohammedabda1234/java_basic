package Interfaces;
//Create an interface with a default method and implement it in a class.
// Do not provide implementation to
// the default method and call the method.

public interface Defualt {
    default void show() {
        System.out.println("default method");
    }
    //no problem to do that
}
