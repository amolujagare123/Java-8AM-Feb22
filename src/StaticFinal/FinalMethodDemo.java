package StaticFinal;

public final class FinalMethodDemo {

   /* final*/ void Mymethod()
    {
        System.out.println("Parent class Method");
    }

}

class Child /*extends FinalMethodDemo*/
{
    void Mymethod()
    {
        System.out.println("Child class Method");
    }
}
