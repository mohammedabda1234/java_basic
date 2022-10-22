package Access_Modifiers;
//Create a class with DEFAULT fields and methods. Access these fields
// and methods from any other class in the same package
public class C {
    int a = 20;
    int b = 50;

    int sum(){
        return a+b;
    }
    int multi(){return a*b;}
}
