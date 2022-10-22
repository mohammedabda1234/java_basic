package Static;
// Write a class with 2 static variables, 2 Instance variables,
// 2 static methods, 2 instance methods and a main method.
public class StaticVariables {
    int a;
    int b;
    static int c;
    static int d;
    public StaticVariables(){
        c++;
        d++;
    }
    public int sub(){//Instance method
        System.out.println(++a);
        System.out.println(++b);
        return a - b;
    }

    public int add(){//Instance method
        System.out.println(a);
        System.out.println(a);
        return a+b;
    }

    public static int mod(){
        return  c % d;
    }

    public static int multi(){
        return c * d;
    }

    public static void main(String[] args) {
        StaticVariables s = new StaticVariables();
        System.out.println(s.add());//Instance method belong to object of class
        System.out.println(s.sub());

       int r = mod();//static method belong to class
        int d = multi();
        System.out.println(r);
        System.out.println(d);
    }
}
