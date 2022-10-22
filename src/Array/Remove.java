package Array;
//Write a function to remove a specific element from an array
public class Remove {
    public static int[] remove(int[] arr,int t){
        int[] result = new int[arr.length-1];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != t){
              result[k]  = arr[i];
              k++;
            }
        }
        return result;
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4,6,5,2,3,9};
        int[] result = remove(arr,9);
        print(result);
    }
}
