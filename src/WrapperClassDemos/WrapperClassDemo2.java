package WrapperClassDemos;

public class WrapperClassDemo2 {

    public static void main(String[] args) {

        Integer ii = new Integer(10);

        int i = ii.intValue(); // unboxing / unwrapping
        int i1 =ii; // auto unboxing / auto unwrapping

        System.out.println("i="+i);

        System.out.println("i1="+i1);



    }
}
