package Array;
//Write a function to insert an element at a specific position in the array
public class Insert {
    public static int[] insert(int[] arr ,int pos,int value){
        int n = arr.length;
        int[] result = new int[n+1];
        for (int i = 0; i < n+1; i++) {
           if (i <pos-1){
               result[i] = arr[i];
           } else if (i == pos-1) {
               result[i] = value;
           }else {
               result[i] = arr[i -1];
           }
        }

        return result;
    }
    public static void print(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,6,7,8,9,0,2};
        int[] result = insert(arr,8,10);
        print(result);
    }
}
