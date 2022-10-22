package Loops;
//Print gender (Male/Female) program according to given M/F using switch
public class Male {
    public static void main(String[] args) {
        char gender = 'O';
        switch (gender){
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Wrong Answer");
        }
    }
}
