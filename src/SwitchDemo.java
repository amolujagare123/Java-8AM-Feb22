import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

/*
        int a = 20;
        int b = 10;
        int c;
        String operation = "mult";*/

        Scanner s = new Scanner(System.in);

        System.out.println("a=");

        int a = s.nextInt();

        System.out.println("b=");

        int b = s.nextInt();
        int c;

        System.out.println("Operation=");

        String operation = s.nextLine();

        switch (operation)
        {
            case "add" : c = a+b;
                System.out.println("Addition="+c);
                break;

            case "sub" : c = a-b;
                System.out.println("Subtraction="+c);
                break;

            case "div" : c = a/b;
                System.out.println("Division="+c);
                break;

            case "mult" : c = a*b;
                System.out.println("Multiplication="+c);
                break;


        }

    }
}
