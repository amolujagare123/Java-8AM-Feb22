package ArraysDemo;

public class IntArrayEvenOdd {

    public static void main(String[] args) {

        int[] a = {23,34,11,56,12,56,78,11}; // even or odd

        System.out.println("length="+a.length);

        for (int i=0;i<a.length;i++) {
            if(a[i]%2==0)
              System.out.println(a[i]+" Even");
            else
                System.out.println(a[i]+" Odd");
        }

    }
}
