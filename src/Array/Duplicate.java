package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Write a function to find the duplicate values of an array
public class Duplicate {
    public static void findDuplicate(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for (int array : arr){
            Integer count = map.get(array);
            if (count == null){
                map.put(array,1);
            }else {
                map.put(array,++count);
            }
        }
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer,Integer> set : entrySet){
            if (set.getValue() > 1)
                System.out.print(set.getKey()+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,6,7,8,6,4,3,5,2};
        findDuplicate(arr);
    }
}
