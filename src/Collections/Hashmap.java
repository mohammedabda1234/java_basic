package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Create a HashMap with at least 10 key value pairs of the Student ID
 and Name Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console Print all
 the Keys of the map to the console Print all the Keys of
 the map to the console Remove a specific Key-value pair
Copy all the elements of the Map to another Map/
 */
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(100,"Ali");
        map.put(101,"john");
        map.put(102,"scott");
        map.put(103,"smith");
        map.put(104,"wayne");
        map.put(105,"sarah");
        map.put(106,"steve");
        map.put(107,"money");
        map.put(108,"jams");
        map.put(109,"lew");
        System.out.println(map);
        System.out.println(map.get(105));//fetch value of key
        System.out.println(map.clone());//copy hashmap

        System.out.println(map.containsKey(104));//Check if the given Key is in the Map
        System.out.println(map.containsValue("Ali"));//Check if the value is in the Map
        System.out.println(map.isEmpty());//Check if the map is empty

        System.out.println(map.size());//Print the size of the Map to the console
        System.out.println(map.keySet());//  Print all the Keys of the map

        String removed = map.remove(102);
        System.out.println(removed);//Remove a specific Key-value pair

        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.putAll(map);
        System.out.println(hashMap);//Copy all the elements of the Map to another Map
    }
}
