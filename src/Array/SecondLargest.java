package Array;
//Write a method to find the second-largest number in an array
public class SecondLargest {
    public static int secondMax(int[] arr){
        int max = arr[0];
        int scdMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                scdMax = max;
                max = arr[i];
            }
            if (arr[i] > scdMax && arr[i] != max){
                scdMax = arr[i];
            }
        }
        return scdMax;
    }
    public static void main(String[] args) {
        int[] arr = {5,8,9,0,6,5,3,2};
        System.out.println(secondMax(arr));
    }
}
