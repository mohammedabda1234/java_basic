package Method_Overloading;
// Write two methods with the same name but different number of parameters of
// different data type and call the methods from main method
public class Different {

    public static int multi(int a,int b){
        return a*b;
    }
//    public static int multi(int a,int b){
//        return a*b;
//    }
//Write two methods with the same name and same number
// of parameters of same type and call from main method
    // can't do that
    public static double multi(double a,int b,long c){
        return a * b * c;
    }
    public static void main(String[] args) {
        System.out.println(multi(45,6));
        System.out.println(multi(34.5,2,54));
    }
}
