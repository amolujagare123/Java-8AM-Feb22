package ClassesConstructors;

public class MyClass {

    public int a;
    public double d;
    public char c;
    public String str; // data members

    public void test()
    {
        System.out.println("test method");
    }

    public void display() // member functions
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
       // test();
    }


}

class TestClasses
{
    public static void main(String[] args) {

        /*int x;
        x = 10;
        System.out.println(x);*/

        MyClass ob = new MyClass();

        ob.a = 20;
        ob.d = 2.2;
        ob.c ='h';
        ob.str="abcd";
        ob.display();

        MyClass ob2 = new MyClass();

        ob2.a = 89;
        ob2.d=7.8;
        ob2.c='f';
        ob2.str="java";

        ob2.display();
    }
}
