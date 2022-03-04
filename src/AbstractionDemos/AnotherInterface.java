package AbstractionDemos;

import ClassesConstructors.MyClass;

public interface AnotherInterface {

     void start();
     void run();
     void display();

     static void method1()
     {

     }
}

interface Interface2
{
     void display();
     static void method1()
     {

     }
}

class TestMultipleInheritance extends MyClass implements AnotherInterface,Interface2
{

     public void start() {
          System.out.println("start");
     }


     public void run() {
          System.out.println("run");
     }

     public void display() {
          System.out.println("display");
     }
}