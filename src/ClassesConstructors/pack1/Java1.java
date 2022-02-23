package ClassesConstructors.pack1;

public class Java1 {

    public int a;
    private double d;
    public char c;
    protected String str; // data members

    void display() // member functions
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.a =90;
        ob.d =9.9;
        ob.c='c';
        ob.str="vaibhav";
        ob.display();
    }
}
