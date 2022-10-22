package Constructors;
//Write a class with a default constructor, one argument constructor
// and two argument constructors. Instantiate
// the class to call all the constructors of that class from a main class
public class Default {
    int rollNum ;
    String name;
    String address;
    int age;
    protected Default(){// default constructor
    }

    protected Default(int rollNum){
        this.rollNum = rollNum;
    }

   protected Default(int rollNum,String name){
        this.rollNum = rollNum;
        this.name = name;
    }
    //Apply private, public, protected and default
    // access modifiers to the constructor
    //default can't apply in constructors
    //private can apply in constructors
    //protected can apply in constructors

    public static void main(String[] args) {
        Default d = new Default();//default constructor
        Default d1 = new Default(40);//one argument constructor
        Default d2 = new Default(80,"Ali");//two argument constructor

        //Try to call the constructor multiple times with the same object
        // can't do that

    }
}
