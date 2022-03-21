package CollectionDemos.vectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("Ashish");
        v.add("Ashish");
        v.add("Amol");
        v.add("Kiran");
        v.add("Ankita");
        v.add("Nirmala");
        v.add(null);

        System.out.println(v);

      /*  Iterator itr = v.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());*/

        Enumeration e = v.elements();
                while(e.hasMoreElements())
                    System.out.println(e.nextElement());
    }
}
