package Loops;
//Write a program to print the odd and even numbers.
public class Odd {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10){
            if (i % 2 == 0){
                System.out.println(i +" Even ");
            }else {
                System.out.println(i +" Odd ");
            }
            i++;
        }
    }
}
