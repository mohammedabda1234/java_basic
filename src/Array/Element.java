package Array;
// Write a method to verify if the array contains two specified elements(12,23)
public class Element {
    public static boolean contains(int[] arr){
        int a = 12;
        int b = 23;
        boolean first = false ,second = false;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == a ){
                first = true;
            } else if (arr[i] == b) {
                second = true;
            }
        }
       return first && second;
    }
    public static void main(String[] args) {
        int[] arr = {2,34,21,23,45,67,89,0};
        System.out.println(contains(arr));
    }
}
