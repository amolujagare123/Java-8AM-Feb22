package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(22);
        al.add(42);
        al.add(16);
        al.add(92);
        al.add(17);

        System.out.println(al.isEmpty());// false
        System.out.println("al="+al);

        ArrayList<Integer> al1 = new ArrayList<>();

        System.out.println(al1.isEmpty());// true
        System.out.println("al1="+al1);


        al1.addAll(al);

        System.out.println("al1="+al1);




    }
}
