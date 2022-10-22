package Array;

import java.util.HashMap;

//Write a program to find the common values between two arrays
public class Common {
    public static void commonElement(int[] arr,int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) +1 );
            }else {
                map.put(arr[i],1 );
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0){
                map.put(arr2[i], map.get(arr2[i]) - 1 );
                System.out.print(arr2[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,0};
        int[] arr1 = {5,4,3,2,1,0};
        commonElement(arr,arr1);
    }
}
