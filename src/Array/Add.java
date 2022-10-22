package Array;

import java.util.Scanner;

//Write a function to add integer values of an array
public class Add {
    public static void add(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = s.nextInt();
       int[] arr = new int[n];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Array Elements Are ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        add();
    }
}
