package CollectionDemos.MapDemos;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(123,"amol");
        tm.put(223,"amar");
        tm.put(133,"asha");
        tm.put(124,"ashwini");
        tm.put(523,"ashish");
        tm.put(163,"nirmala");
        tm.put(100,"kalyani");

        System.out.println(tm);
    }
}
