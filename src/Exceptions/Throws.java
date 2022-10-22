package Exceptions;
//Write a method which throws exception,
// Call that method in main class without try block
public class Throws {
    public static int nullPointer(int[] arr){
        if (arr == null){
            throw new NullPointerException();
        }
        return arr[0];
    }

    public static void main(String[] args) {

        int[] arr = null;
        int a = nullPointer(arr);
        System.out.println(a);

    }
}
