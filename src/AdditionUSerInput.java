import java.util.Scanner;

public class AdditionUSerInput {
   // psvm
    public static void main(String[] args) {

        int a ;
        int b ;
        int c;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter value of a:");
        a = s.nextInt();

        System.out.println("Enter value of b:");
        b = s.nextInt();


        c = a + b;

        //sout
        System.out.println("Addition="+c);

    }
}
