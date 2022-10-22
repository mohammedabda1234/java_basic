package Constructors;
//Call the constructors(both default and argument constructors)
// of super class from a child class
public class Child  extends Default{
    String likely;

    public Child() {
        super();
    }
//Write constructors with return type int and String
    //can't apply return types
    public Child(String likely) {
        super();
        this.likely = likely;
    }

}
