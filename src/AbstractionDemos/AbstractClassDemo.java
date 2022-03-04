package AbstractionDemos;

public abstract class AbstractClassDemo {

    abstract void start();
    abstract void run();

    void display()
    {
        System.out.println("this is display");
    }
}

class ChildClass extends AbstractClassDemo
{

    void start() {
        System.out.println("Start");
    }

    void run() {
        System.out.println("run");
    }

    public static void main(String[] args) {
        AbstractClassDemo ob = new ChildClass();
        ob.run();
        ob.start();
    }
}
