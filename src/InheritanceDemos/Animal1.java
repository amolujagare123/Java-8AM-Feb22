package InheritanceDemos;

public class Animal1 {

    void eat()
    {
        System.out.println("eat");
    }
}

class Mamal extends Animal1 {

    void walk()
    {
        System.out.println("walk");
    }
}

class Reptile extends Animal1 {

    void crowl()
    {
        System.out.println("crowl");
    }
}

class Tiger extends Mamal {

    void roar()
    {
        System.out.println("roar");
    }
}

class TestInheritance2
{
    public static void main(String[] args) {

        Animal1 a = new Animal1();
        a.eat();

        Mamal m = new Mamal();
        m.walk();
        m.eat();

        Reptile r = new Reptile();
        r.crowl();
        r.eat();

        Tiger t = new Tiger();
        t.roar();
        t.walk();
        t.eat();

    }
}

