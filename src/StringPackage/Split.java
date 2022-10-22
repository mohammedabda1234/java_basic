package StringPackage;
//Splitting strings with split()
public class Split {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] arr = str.split("",9);
        for (String a : arr)
            System.out.println(a);
        System.out.println("_____________________--");
        String[] num = str.split("e",4);
        for (String a :num)
            System.out.println(a);
    }
}
