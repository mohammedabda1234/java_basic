package Array;
//Write a function to find the missing number of sorted array of 1 to 100
public class Missing {
    public static int missingNum(int[] arr){
        int n = 100 + 1;
        int sum = n * (n + 1)/2;
        for (int num : arr){
            sum = sum - num;
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
