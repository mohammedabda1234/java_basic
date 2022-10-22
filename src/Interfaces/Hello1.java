package Interfaces;
// Create two interfaces with the same method (same signature) in both the interfaces.
// Implement these two interfaces in one class. Call the method.
public interface Hello1 {
    int sum(int a,int b);
}
class O implements Hello1,Hello{
    @Override
    public int sum(int a, int b) {
        return 0;
    }
    // just we need one method
}
