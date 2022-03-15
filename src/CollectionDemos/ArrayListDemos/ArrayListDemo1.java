package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

    public static void main(String[] args) {


        ArrayList al = new ArrayList();

        al.add("Ashish");
        al.add("Ashish");
        al.add("Amol");
        al.add("Kiran");
        al.add("Ankita");// 3
        al.add("Nirmala");
        al.add(12);
        al.add('s');
        al.add(12.44);
        al.add(12.44);
        al.add(true);

        System.out.println(al);
        System.out.println("Size=" + al.size());

        //System.out.println(al.get(3));

  /*      for (int i = 0; i < al.size(); i++)
         {
            System.out.println(al.get(i));
        }*/

// for each
    /*    for (Object ob:al)
        {
            System.out.println(ob);
        }
*/

        Iterator itr = al.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());


    }
}
