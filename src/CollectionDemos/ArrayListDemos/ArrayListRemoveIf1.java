package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveIf1 {

    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList<>();
        al.add("Ashish");
        al.add("Amol");
        al.add("Kiran");
        al.add("Ankita");
        al.add("Nirmala");

        System.out.println("al="+al);
        // 1. identify the type of the list
        // 2. choose a variable ( no need to specify its type)
        // this variable will represent each item of the list
        // 3. use predicate symbol ( -> )
        // 4. write the condition

        al.removeIf(str -> str.endsWith("a"));
        System.out.println("al="+al);





    }
}
