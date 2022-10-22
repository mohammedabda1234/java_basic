package Exceptions;

import java.util.Scanner;

public class IOException {
    public static void main(String[] args) {
        Scanner s = new Scanner("Hello");
        String str = s.nextLine();
        System.out.println(str);
    }
}
