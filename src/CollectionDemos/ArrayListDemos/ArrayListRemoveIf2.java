package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveIf2 {

    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList<>();
        al.add("Ashish");
        al.add("Amol");
        al.add("Kiran");
        al.add("Ankita");
        al.add("Nirmala");
        al.add("rani");
        al.add("sarita");
        al.add("ravi");
        al.add("Raj");
        al.add("avinash");

        System.out.println("al="+al);
        // 1. identify the type of the list
        // 2. choose a variable ( no need to specify its type)
        // this variable will represent each item of the list
        // 3. use predicate symbol ( -> )
        // 4. write the condition

        // remove the elements whose length is less than 5


        al.removeIf(str -> str.length()<5);


        System.out.println("al="+al);





    }
}
