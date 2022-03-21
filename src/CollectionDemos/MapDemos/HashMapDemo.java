package CollectionDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hs = new HashMap();

        System.out.println(hs.isEmpty());

        hs.put(132,"amol");
        hs.put(322,"ashish");
        hs.put(111,"ashwini");
        hs.put(232,"amar");
        hs.put(342,"aniket");
        hs.put(34.2,'h');
        hs.put('h',true);
        hs.put(3.42,"aniket");
      //  System.out.println(hs.put(342,"Rahul"));

        hs.put(112,null);
        hs.put(113,null);
        hs.put(114,null);

        hs.put(null,12);
        hs.put(null,123);
        System.out.println(hs.isEmpty());

        System.out.println(hs.size());
        System.out.println(hs);

        hs.clear();
        System.out.println(hs);
    }
}
