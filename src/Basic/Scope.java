package Basic;

public class Scope {
    /*
    Define the local and Global variables with
    the same name and print both variables
    and understand the scope of the variables/
     */
    int t = 4;//global variable
    public static void main(String[] args) {
        Scope s = new Scope();
        s.print();
    }
    public void print(){
        int t = 8;//local variable
        System.out.println("local variable = "+t);
        System.out.println("global variable = "+this.t);

    }
}
