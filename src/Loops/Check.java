package Loops;
//Program to check whether a number is EVEN or ODD using switch
public class Check {
    public static void main(String[] args) {
        int num  = 11;
        switch (num % 2 ){
            case 0:
                System.out.println(num +" even");
                break;
            case 1:
                System.out.println(num +" odd");
                break;
        }
    }
}
