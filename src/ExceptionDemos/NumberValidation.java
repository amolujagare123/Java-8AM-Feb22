package ExceptionDemos;

public class NumberValidation {

    void checkNumber(int i) // 1 to 10
    {
        if(i>=1 && i<=10)
            System.out.println("we are safe");
        else
            throw new ArithmeticException("we are in danger");
    }

    public static void main(String[] args) {

        NumberValidation ob = new NumberValidation();

        System.out.println("we want to use below number in the operation");

        int a =12;
        ob.checkNumber(a);

        int c = 1000-a;
        System.out.println("c="+c);
        System.out.println("end of the program");
    }

}
