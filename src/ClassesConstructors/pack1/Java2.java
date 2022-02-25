package ClassesConstructors.pack1;

public class Java2 extends Java1{

    public static void main(String[] args) {
        Java1 ob = new Java1();
        ob.a =90;
      //  ob.d =9.9;
        ob.c='c';
        ob.str="vaibhav";
        ob.display();

        Java2 j2 = new Java2();

        j2.a =90;
       // j2.d =9.9; // private member
        j2.c='c';
        j2.str="vaibhav";
        j2.display();
    }
}
