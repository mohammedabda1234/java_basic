package Operators;

public class Operator {
    //Write a function for arithmetic operators(+,-,*,/)
    public void operator(int n,int m){
        int add = n + m;
        int sub = n - m;
        int multi = n * m;
        int  div = n / m;
        System.out.println(add+" "+sub+" "+multi+" "+div);
    }
    public static void main(String[] args) {
        Operator o = new Operator();
        o.operator(8,4);
    }
}
