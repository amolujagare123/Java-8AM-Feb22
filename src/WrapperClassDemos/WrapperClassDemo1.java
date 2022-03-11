package WrapperClassDemos;

public class WrapperClassDemo1 {

    public static void main(String[] args) {

        int i =10;
        System.out.println("i="+i); // wrapping / boxing

        Integer ii = new Integer(10);
        Integer ii1 =10;  // auto wrapping /auto boxing

        System.out.println("ii="+ii);

        Float ff = new Float(12.45);
        Float ff1 = 11.45f;
        System.out.println("ff="+ff);

        Double dd = new Double(11.56);
        Double dd1 = 90.8;
        System.out.println("dd="+dd);

        Character cc = new Character('h');
        System.out.println("cc="+cc);

    }
}
