package CollectionDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo3 {

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

        System.out.println(hs.get(111));

        hs.remove(111);
        System.out.println("hs="+hs);

        System.out.println(hs.containsKey(322)); // true
        System.out.println(hs.containsValue("ashwini"));//false

    }
}
