package ClassesConstructors;

public class MyClass3 {

    int a;
    double d;
    char c;
    String str; // data members

    void display() // member functions
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    MyClass3()
    {
        a = 11;
        d = 2.3;
        c='d';
        str="selenium";
    }

    public static void main(String[] args) {

        MyClass3 ob = new MyClass3();

        ob.display();

        ob.a = 88;
        ob.d = 9.9;
        ob.c ='a';
        ob.str ="kiran";

        ob.display();

    }
}
