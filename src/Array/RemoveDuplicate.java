package Array;

import java.util.HashMap;
import java.util.LinkedHashSet;

//Write a method to remove duplicate elements from an array
public class RemoveDuplicate {

    public static void removeDuplicates(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.print(set+" ");
    }
    public static void removeDuplicate(int[] arr){
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null){
                System.out.print(arr[i]+" ");
                map.put(arr[i],true );
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,8,7,4,3,5,6,7,8,9,0,3,2,1,2,3,4,8};
        removeDuplicates(arr);
    }
}
