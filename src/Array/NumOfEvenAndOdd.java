package Array;
// Write a method to find number of even number and odd numbers in an array
public class NumOfEvenAndOdd {
    public static void numOfEvenAndOdd(int[] arr){
        int numOdd = 0;
        int numEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                numEven++;
            }else {
                numOdd++;
            }
          }
        System.out.println("number of Even "+numEven);
        System.out.println("number of Odd "+numOdd);
    }

    public static void main(String[] args) {
        int[] arr = {6,8,9,5,4,3,2,1};
        numOfEvenAndOdd(arr);
    }
}
