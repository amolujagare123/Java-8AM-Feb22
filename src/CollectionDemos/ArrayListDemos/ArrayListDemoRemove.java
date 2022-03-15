package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemoRemove {

    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList<>();

        al.add("Ashish");
        al.add("Ashish");
        al.add("Amol");
        al.add("Kiran");
        al.add("Ankita");
        al.add("Nirmala");

        System.out.println(al);

        al.remove("Amol");
        System.out.println(al);

        al.remove(4);
        System.out.println(al);



    }
}
