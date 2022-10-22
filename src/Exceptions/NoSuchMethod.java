package Exceptions;
//Write a program to generate NoSuchMethodException
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class NoSuchMethod {
    public static void main(String[] args) {
        Set<Integer> set = new  HashSet<>();
        Hashtable hashtable = new Hashtable<>();
//        set.iterator().next;
        hashtable.elements().nextElement();
    }
}
