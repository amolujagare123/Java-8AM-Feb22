package AbstractionDemos;

public interface InterfaceDemo {

    void start();
    void run();

    default void display()
    {
        System.out.println("display");
    }

    static void display2()
    {
        System.out.println("display2 ");
    }

    private void display3()
    {
        System.out.println("display3 ");
    }
}

class ChildInterface implements InterfaceDemo
{


    public void start() {
        System.out.println("Start");
    }


    public void run() {
        System.out.println("run");
    }

    public static void main(String[] args) {

        InterfaceDemo ob = new ChildInterface();
        ob.start();
        ob.run();
        ob.display();

        InterfaceDemo.display2();
    }
}