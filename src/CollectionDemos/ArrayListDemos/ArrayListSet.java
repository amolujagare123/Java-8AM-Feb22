package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListSet {

    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList<>();

        al.add("Ashish");
        al.add("Ashish");
        al.add("Amol");
        al.add("Kiran");
        al.add("Ankita");
        al.add("Nirmala");

        System.out.println("al="+al);

        // set method will update the element in the list
        // at particular index

        al.set(2,"abc");
        System.out.println("al="+al);



    }
}
