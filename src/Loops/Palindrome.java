package Loops;
//Write a program to palindrome or not
public class Palindrome {
    private int reverseDigits(int num){
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
    public boolean isPalindrome(int n){
        int rev_n = reverseDigits(n);
        if (rev_n == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(122));
    }
}
