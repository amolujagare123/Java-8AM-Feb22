package CollectionDemos.SetDemo;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("rudra");
        hs.add("amol");
        hs.add("ashish");
        hs.add("kalyani");
        hs.add("ashwini");
        hs.add(null);
        System.out.println(hs.add("ashwini"));

        System.out.println(hs);

    }
}
