package Array;
//Write a function to copy an array to another array
public class Copy {
    public static int[] copy(int[] arr){
        int[] result = arr;
        for (int a :result){
            System.out.print(a+" ");
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {7,9,8,4,5,3,2};
        int[] result = copy(arr);
    }
}
