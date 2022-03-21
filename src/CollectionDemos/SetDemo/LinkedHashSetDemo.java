package CollectionDemos.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
       
        lhs.add("rudra");
        lhs.add("amol");
        lhs.add("ashish");
        lhs.add("kalyani");
        lhs.add("ashwini");
        lhs.add(null);
        System.out.println(lhs.add("ashwini"));

        System.out.println(lhs);

    }
}
