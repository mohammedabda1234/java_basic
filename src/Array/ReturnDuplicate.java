package Array;

import StringPackage.Object;

import java.util.*;

// Write a program to remove the duplicate elements and return the new array
public class ReturnDuplicate {
    public static int removeDuplicate(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[n - 1];

        return j;
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {6,8,7,4,3,5,6,7,8,9,0,3,2,1,2,3,4,8};
        int result = removeDuplicate(arr);
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
