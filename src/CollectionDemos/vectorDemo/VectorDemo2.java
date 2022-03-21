package CollectionDemos.vectorDemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>(); // default capacity = 10

        System.out.println("Size=" + v.size()); // 0
        System.out.println("Capacity=" + v.capacity()); // 10


        v.add("Ashish");
        v.add("Ashish");
        v.add("Amol");
        v.add("Kiran");
        v.add("Ankita");
        v.add("Nirmala");
        v.add(null);
        v.add("Nirmala");
        v.add("Nirmala");
        v.add("Nirmala");
        v.add("Nirmala");
        v.add("Ashish");
        v.add("Ashish");
        v.add("Amol");
        v.add("Kiran");
        v.add("Ankita");
        v.add("Nirmala");
        v.add(null);
        v.add("Nirmala");
        v.add("Nirmala");
        v.add("Nirmala");
        v.add("Nirmala");


        System.out.println("Size=" + v.size());// 22
        System.out.println("Capacity=" + v.capacity()); // 10


        System.out.println(v);

    }

}
