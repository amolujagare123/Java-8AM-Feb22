package CollectionDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo2 {

    public static void main(String[] args) {

        HashMap hs = new HashMap();


        hs.put(132,"amol");
        hs.put(322,"ashish");
        hs.put(111,"ashwini");
        hs.put(232,"amar");
        hs.put(342,"aniket");
        hs.put(34.2,'h');
        hs.put('h',true);
        hs.put(3.42,"aniket");

        System.out.println("hs="+hs);

        HashMap hs1 = new HashMap();

        System.out.println("hs1="+hs1);

        hs1.putAll(hs);

        System.out.println("hs1="+hs1);

    }
}
