package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList<>();

        al.add("Ashish");
        al.add("Ashish");
        al.add("Amol");
        al.add("Kiran");
        al.add("Ankita");// 3
        al.add("Nirmala");

        System.out.println(al);

        for (String str: al)
            System.out.println(str);



    }
}
