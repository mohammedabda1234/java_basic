package Array;

import java.util.Arrays;

//Write a function to test if array contains a specific value
public class Test {
    public static boolean contain(int[] arr,int t){
        Arrays.sort(arr);
      int res = Arrays.binarySearch(arr,t);
       boolean index = res > 0 ? true : false;
       return index;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,7,8,9,0,1};
        System.out.println(contain(arr,2));
    }
}
