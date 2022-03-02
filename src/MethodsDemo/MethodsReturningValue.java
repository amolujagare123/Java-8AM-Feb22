package MethodsDemo;

import ClassesConstructors.MyClass;

public class MethodsReturningValue {

    int getMyInteger()
    {
      //  System.out.println("inside method getMyInteger");
      //  System.out.println("yhis will return integer values");


        return 20;
    }

    char getMyChar()
    {
        char ch = 'r';
        return ch;
    }

    boolean getBooleanValue()
    {
       /* boolean b = false;
        return b;*/

        return true;
    }

    double[] getMyArray()
    {
        double[] dArray = {12.3,23.4,34.5,45.6,56.7,67.8,78.9};
        return dArray;
    }

    double[][] getMyTwoDArray()
    {
        double[][] decimalTwoDi ={

                {12.3,23.4,34.5},
                {22.3,22.4,31.1},
                {32.3,29.4,14.1},
                {42.3,27.4,24.3} // 4 x 3
        };
        return  decimalTwoDi;
    }

    // ---  method returning an object -----------

    MyClass getMyLoadedObject()
    {
        MyClass obj = new MyClass();
        obj.a=88;
        obj.d=1.2;
        obj.c='w';
        obj.str="string";

        return obj;
    }



    public static void main(String[] args) {

        int x;

        x = 10; // whenever a variable holds a value we can

        int c = 100 + x; // do operations
      //  System.out.println(x); // print
        int b ;
        b = x; // assign

        MethodsReturningValue ob = new MethodsReturningValue();
        System.out.println("-------------int as return type-------------");

        //ob.getMyInteger();
       // Whenever method returns a value,
        // it actually holds the value it returns
        int add = 100 + ob.getMyInteger(); // operation
        System.out.println("addition="+add); // 120
        System.out.println(ob.getMyInteger()); // print --> 20
        int y = ob.getMyInteger(); // assignment
        System.out.println("y="+y); // 20

        System.out.println("-------------character as return type-------------");
        System.out.println(ob.getMyChar());
        char myChar = ob.getMyChar();
        System.out.println("Mychar="+myChar);

        System.out.println("-------------boolean as return type-------------");


        if(ob.getBooleanValue())
            System.out.println("This is true");
        else
            System.out.println("This is false");


        System.out.println("-------------Array (single Dimensional) as return type-------------");

        double[] arr = ob.getMyArray();

        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"  ");


        System.out.println();

        System.out.println("-------------Array (Two Dimensional) as return type-------------");


        double[][] myArr = ob.getMyTwoDArray();

        for (int i=0;i<myArr.length;i++)
        {
            for (int j=0;j<myArr[0].length;j++)
            {
                System.out.print(myArr[i][j]+"\t"); // \t --> tab
            }
            System.out.println();
        }


        System.out.println("-------------Class/Object as return type-------------");

        MyClass myClass = ob.getMyLoadedObject();
        myClass.display();

    }
}
