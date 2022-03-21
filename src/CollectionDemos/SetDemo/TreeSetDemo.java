package CollectionDemos.SetDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();
       
        ts.add("rudra");
        ts.add("amol");
        ts.add("ashish");
        ts.add("kalyani");
        ts.add("ashwini");

        System.out.println(ts.add("ashwini"));

        System.out.println(ts);

    }
}
