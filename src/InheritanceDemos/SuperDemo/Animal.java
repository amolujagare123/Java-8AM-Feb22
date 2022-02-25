package InheritanceDemos.SuperDemo;

public class Animal {

    String color = "Black";

    Animal()
    {
        System.out.println("inside Animal constructor");
    }

    Animal(int legs)
    {
        System.out.println("Legs="+legs);
        System.out.println("inside Animal constructor");
    }


    public void property()
    {
        System.out.println("Animal property");
    }
}

class Dog extends Animal{

    Dog()
    {
       /* super(4);*/
        System.out.println("inside dog constructor");
    }

    String color = "White";

    public void property()
    {
        System.out.println("Dog property");
    }

    void printColor()
    {
        property();
        super.property();
        System.out.println("color="+color);
        System.out.println("color="+super.color);
    }


}

class TestInheritance
{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
