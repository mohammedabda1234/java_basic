package Loops;
//Write a program to print largest number among three numbers.
public class Largest {
    public static void main(String[] args) {
        int i = 10,j =15,k =12;
        int a = 1;
        System.out.println("Largest number is "+Math.max(i,Math.max(j,k)));//first way


            if (i > j && i > k){//second way
                System.out.println(i +" largest");
            }else if (j > i && j > k){
                System.out.println(j +" largest");
            }else {
                System.out.println(k +" largest");
        }
    }
}
