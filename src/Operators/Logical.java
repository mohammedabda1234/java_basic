package Operators;

public class Logical {
    //Programs on Logical AND,OR operator and Logical NOT
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 10;

        if ((a < b) && (c > a)){// && and operator
            System.out.println("AND logical ");// || or operator
        }

        if ((a == b) || (b < c)){
            System.out.println("OR logical");
        }

        if (!(c < a)){// ! not operator
            System.out.println("NOT logical");
        }
    }
}
