package Method_Overloading;
//Write two methods with the same name but different number
// of parameters of same type and call the methods from main method
public class Methods {

    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        sum(2,5);
        sum(3,6,9);
    }
}
