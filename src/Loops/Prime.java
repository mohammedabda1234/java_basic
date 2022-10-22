package Loops;
//Write a program to find the prime or not
public class Prime {
    public boolean isPrime(int n){
        if (n <= 2)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
      return true;
    }
    public static void main(String[] args) {
        Prime p = new Prime();
        System.out.println(p.isPrime(8));
    }
}
