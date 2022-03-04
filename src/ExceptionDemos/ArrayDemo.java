package ExceptionDemos;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] =11;
        a[1] =11;
        a[2] =11;
        a[3] =11;
        a[4] =11;
        a[5] =11;

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);

        System.out.println("End of the program");
    }
}
