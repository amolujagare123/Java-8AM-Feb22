package MethodsDemo;

public class MethodArguments {

    int x;

    void display() // no arguments/parameter
    {
        System.out.println("this is display");
    }

    void intSingle(int x)
    {
        System.out.println("this is intSingle method");
        System.out.println("this is use of x variable");
        System.out.println("x="+x);
    }

    void intMultiple(int x,int y,int z)
    {
        System.out.println("this is intMultiple method");
        System.out.println("this is use of x,y,z variable");
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }

    void intMultipleDiff(int x,double y,char z)
    {
        System.out.println("this is intMultipleDiff method");
        System.out.println("this is use of x,y,z variable");
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }

    void mySingleDArray(int[] arr)
    {
        System.out.println("Below is the given array");

        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        MethodArguments ob = new MethodArguments();

        int y = 10;

        ob.intSingle(y);

       /* ob.display();

        ob.intSingle(78);
        ob.intMultiple(45,12,11);
        ob.intMultipleDiff(34,5.6,'g');*/

        int[] a ={87,32,4,2,11,32,90};

        ob.mySingleDArray(a);
    }
}
