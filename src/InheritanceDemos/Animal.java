package InheritanceDemos;

public class Animal {

    void eat()
    {
        System.out.println("eat");
    }
}

class Dog extends Animal {

    void barks()
    {
        System.out.println("barks");
    }
}

class  BabyDog extends Dog{

        void weeps()
        {
            System.out.println("weeps");
        }

}

class TestInheritance
{
    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.eat();
        d.barks();

        BabyDog bd = new BabyDog();
        bd.weeps();
        bd.barks();
        bd.eat();
    }
}

