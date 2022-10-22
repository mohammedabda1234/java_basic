package Array;
//Write a function to get the difference of largest and smallest value
public class Difer {
    public static int difference(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max - min;
    }
    public static void main(String[] args) {
        int[] arr = {6,8,9,1};
        System.out.println(difference(arr));
    }
}
