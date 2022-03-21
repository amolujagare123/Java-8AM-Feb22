package CollectionDemos.MapDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo4 {

    public static void main(String[] args) {

        HashMap hs = new HashMap();


        hs.put(132,"amol");
        hs.put(322,"ashish");
        hs.put(111,"ashwini");
        hs.put(232,"amar");
        hs.put(342,"aniket");
        hs.put(34.2,'h');

        System.out.println("hs="+hs);

        Set keySet = hs.keySet();
        System.out.println(keySet);

        Collection values = hs.values();
        System.out.println(values);

        Set entrySet = hs.entrySet();
        System.out.println(entrySet);

    }
}
