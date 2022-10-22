package Static;

public class CompleteClass {
    int a = 20;// Instance variables
    int b = 30;// Instance variables
    static int c = 40;//static variables
    static int d = 50;//static variables

    void instance1(){//instance method
        System.out.println("static variable "+c);//print instance variable in
    }
    void instance2(){//instance method
        static1();//Call static methods in instance methods
    }

    static void static1(){//static method
//        System.out.println("instance variable "+a);//Print instance variables in static methods
//        error here
    }
    static void static2(){//static method
//        instace1();//Call instance methods in static methods
        //error here
    }
    public static void main(String[] args) {
        CompleteClass completeClass = new CompleteClass();
        //Print all the static, instance variables in main method
        //static variables
        System.out.println(c);
        System.out.println(d);
        //instance call via object class
        System.out.println(completeClass.a);
        System.out.println(completeClass.b);

        //Call static methods and instance methods in main method
        //static method
        static1();
        static2();
        //instance method
        completeClass.instance1();
        completeClass.instance2();
    }
}
