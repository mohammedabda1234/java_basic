package Loops;
//Program for multiple if else statement(Largest number in 10,20 and 30)
public class Statement {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if (a > b && a > c){
            System.out.println(a +" is largest");
        } else if (b > a && b > c) {
            System.out.println(b +" is largest");
        }else {
            System.out.println(c +" is largest");
        }
    }
}
