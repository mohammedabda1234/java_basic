package Method_Overloading;
//Write two methods with the same name and same number
// of parameters of different type and call from main method
public class Same {

    public static int show(int a){
        return a;
    }
    public static String show(String name){
        return name;
    }
    public static void main(String[] args) {
        System.out.println(show("Ali"));
        System.out.println(show(4));
    }
}
