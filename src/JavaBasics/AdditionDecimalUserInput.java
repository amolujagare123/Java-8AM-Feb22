package JavaBasics;

import java.util.Scanner;

public class AdditionDecimalUserInput {

    public static void main(String[] args) {

        double d1;
        double d2;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter first decimal value:");
        d1 = s.nextDouble();
        System.out.println("Enter second decimal value:");
        d2 = s.nextDouble();

        double add;
        add = d1+d2;

        System.out.println("Addition="+add);

    }
}
