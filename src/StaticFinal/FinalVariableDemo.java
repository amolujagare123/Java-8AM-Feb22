package StaticFinal;

public class FinalVariableDemo {

    final int speed =150;

    void change()
    {
      //  speed = 200;
    }

    public static void main(String[] args) {

        FinalVariableDemo ob = new FinalVariableDemo();
        ob.change();
        System.out.println(ob.speed); // 150
    }
}
