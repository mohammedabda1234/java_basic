package Collections;
/*
/Create an ArrayList of type String with 10 string elements.
Add 10 string elements to ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("well");
        al.add("come");
        al.add("Ali");
        al.add("hi");
        al.add("face");
        al.add("yes");
        al.add("world");
        al.add("java");
        al.add("C#");

        Iterator<String> it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        al.add(5,"thanks");//add element at a specific index
        al.remove("come");//remove element
        al.remove(3);//remove index
        al.get(4);//Get an element at a particular index
        al.set(6,"C++");//Update the element at a specific index
        al.size();//size of arraylist;
        al.contains("C#");//

        ArrayList<String> al1 = new ArrayList<>();
        al1.add("hello");
        al1.add("java");
        al1.add("C++");

        System.out.println("All element are removed "+al1.removeAll(al));
    }
}
