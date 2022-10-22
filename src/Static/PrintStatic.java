package Static;
//Print static variables in Instance methods
public class PrintStatic {
    static int a = 20;

    void print(){
        a = 30;
        System.out.println(a);
    }
    public static void main(String[] args) {
        PrintStatic p = new PrintStatic();
        p.print();
    }
}
