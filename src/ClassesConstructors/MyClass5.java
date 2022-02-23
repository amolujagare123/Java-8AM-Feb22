package ClassesConstructors;

public class MyClass5 {

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

    // parameterized constructor with this operator
    MyClass5(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c=c;
        this.str=str;
    }

    public static void main(String[] args) {

        MyClass5 ob = new MyClass5(23,3.4,'h',"amol");

        ob.display();

    }
}
