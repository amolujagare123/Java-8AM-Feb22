package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(22);
        al.add(42);
        al.add(16);
        al.add(92);
        al.add(17);

        System.out.println(al);

       /* for (int a: al)
            System.out.println(a);
*/

        for (Integer a: al)
            System.out.println(a);



    }
}
