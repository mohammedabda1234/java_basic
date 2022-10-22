package Array;
//Write a function to find the minimum and maximum value of an array
public class Max {
    public static void maxAndMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max= arr[i];
        }
        System.out.println("Maximum value is "+max);
        System.out.println("Minimum value is "+min);
    }
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,3,2,0};
        maxAndMin(arr);
    }
}
