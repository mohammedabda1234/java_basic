package Array;
//Write a function to calculate the average value of an array of integers
public class Avg {
    public static int average(int[] array){
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg = avg + array[i];
        }
        return avg/array.length;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(average(arr));
    }
}
