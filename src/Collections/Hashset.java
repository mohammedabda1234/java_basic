package Collections;

import java.util.HashSet;
import java.util.Iterator;

/*
Create a HashSet with at least 10 elements
of type String Write program covering all the operations of HashSet
 /
 */
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Ali");
        hashSet.add("Ahmed");
        hashSet.add("Adam");
        hashSet.add("Alyas");
        hashSet.add("Akram");
        hashSet.add("Emad");
        hashSet.add("Hamed");
        hashSet.add("Tahir");
        hashSet.add("Ruaf");
        hashSet.add("Sarah");

        System.out.println(hashSet);
        hashSet.remove("Ali");
        System.out.println(hashSet.contains("Ali"));
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.size());

        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.addAll(hashSet);
        hashSet1.add("yousif");
        System.out.println(hashSet1);

//        hashSet.retainAll(hashSet1);//intersection
//        System.out.println(hashSet);
//        hashSet1.removeAll(hashSet);//different
//        System.out.println(hashSet1);

        System.out.println(hashSet1.containsAll(hashSet));//subset
    }
}
