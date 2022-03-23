package CollectionDemos.MapDemos;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(123,"amol");
        lhm.put(223,"amar");
        lhm.put(133,"asha");
        lhm.put(124,"ashwini");
        lhm.put(523,"ashish");
        lhm.put(163,"nirmala");
        lhm.put(100,"kalyani");

        System.out.println(lhm);
    }
}
