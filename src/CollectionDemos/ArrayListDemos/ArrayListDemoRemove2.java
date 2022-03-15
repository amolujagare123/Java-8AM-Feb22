package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemoRemove2 {

    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(22);
        al.add(42);
        al.add(16);
        al.add(92);
        al.add(7);
        al.add(6);
        al.add(11);
        al.add(5);
        al.add(5);

        System.out.println(al);

      /*  Integer ii = 5;
        al.remove(ii);*/

        // int --> primitive
        //Integer --> non primitive / object

        al.remove(new Integer(5));

        System.out.println(al);


       // al.get(al.size()/2)







    }
}
