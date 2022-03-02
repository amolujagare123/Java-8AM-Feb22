package MethodsDemo;

import ClassesConstructors.MyClass;

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

    void printTheString(String myString)
    {
        System.out.println("I will print string");


        System.out.println("My string="+myString);
    }

    void printTheSplittedString(String myString)
    {
        System.out.println("splitting string with space");

        for (int i=0;i<myString.split(" ").length;i++)
            System.out.println(myString.split(" ")[i]);

    }

    void setMyObject(MyClass obj)
    {
        obj.a=11;
        obj.d=1.1;
        obj.c='a';
        obj.str="aaaaa";
    }

    public static void main(String[] args) {
        MethodArguments ob = new MethodArguments();

        int y = 10;

        ob.intSingle(y);

       /* ob.display();

        ob.intSingle(78);
        ob.intMultiple(45,12,11);
        ob.intMultipleDiff(34,5.6,'g');*/

       // int[] a ={87,32,4,2,11,32,90};
       // ob.mySingleDArray(a);

        MyClass myClass = new MyClass();
        myClass.display();

        ob.setMyObject(myClass);

        myClass.display();


        ob.printTheString("Ashish");

        ob.printTheSplittedString("this is a java class");

    }
}
