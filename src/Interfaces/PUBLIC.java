package Interfaces;
//Create a PUBLIC interface with fields and methods,
// fields should have values assigned. Implement this interface to some class
// and print the values of the interface fields and call the interface methods
public interface PUBLIC {
    public int a = 20;
    public int b = 40;

    public void print();

    public int sum();
}

class N implements PUBLIC{
    @Override
    public void print() {
        System.out.println(PUBLIC.a+" "+PUBLIC.b);
    }

    @Override
    public int sum() {
        return PUBLIC.a + PUBLIC.b;
    }

    public static void main(String[] args) {
        N n = new N();
        n.print();
        System.out.println(n.sum());
    }
}
