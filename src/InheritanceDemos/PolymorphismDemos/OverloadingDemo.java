package InheritanceDemos.PolymorphismDemos;

public class OverloadingDemo {

     // method overloading example

    int a;
    int b;

    void addition()
    {
        int c;
        c= a+b;
        System.out.println("addition="+c);
    }

    void addition(int x)
    {
        int c;
        c= a+x;
        System.out.println("addition="+c);
    }

    void addition(int x,int y)
    {
        int c;
        c= y+x;
        System.out.println("addition="+c);
    }

    void addition(int x,int y,int z)
    {
        int c;
        c= y+x+z;
        System.out.println("addition="+c);
    }

    void addition(double x,double y)
    {
        double c;
        c= y+x;
        System.out.println("addition="+c);
    }

    void addition(String x,String y)
    {
        String c;
        c= x+y;
        System.out.println("addition="+c);
    }

    public static void main(String[] args) {

        OverloadingDemo ob = new OverloadingDemo();
        ob.a=90;
        ob.b=10;
        ob.addition();
        ob.addition(45);
        ob.addition(12,12);
        ob.addition(12,12,12);
        ob.addition(1.2,1.2);
        ob.addition("Java+","Selenium");

    }
}
