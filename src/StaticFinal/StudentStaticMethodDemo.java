package StaticFinal;

public class StudentStaticMethodDemo {
    int rno;
    String name;
    public static String college="ITC";

    public  static void staticMethod()
    {
        System.out.println("I am static");
    }

    void nonStaticMethod()
    {
        System.out.println("I am non static");
    }


    void display() // non static method
    {
        System.out.println("rno="+rno); // non static - allowed
        System.out.println("name="+name); //non static - allowed
        System.out.println("college="+college);//  static - allowed
        staticMethod();  //  static - allowed
        nonStaticMethod();//non static - allowed
    }

    public static void display2() //static method
    {
       // System.out.println("rno="+rno); // non static - not allowed
     //   System.out.println("name="+name); //non static - not allowed
        System.out.println("college="+college);//  static - allowed

        staticMethod();  //  static - allowed
      //  nonStaticMethod();//non static - not allowed
    }

    public static void main(String[] args) {

        StudentStaticMethodDemo ob = new StudentStaticMethodDemo();

        ob.staticMethod(); // static method called using object
        StudentStaticMethodDemo.staticMethod();// static method called using Class Name

    }
}
