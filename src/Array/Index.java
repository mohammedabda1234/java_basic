package Array;
//Write a program to find the index of an array element
public class Index {
    public static int index(int[] arr,int t){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,8,3,2,9};
        System.out.println(index(arr,10));
    }
}
