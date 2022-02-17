package ArraysDemo;

public class TwoDArrayDemo {

    public static void main(String[] args) {

        int[][] a = new int[5][3];

        a[0][0] =78;
        a[0][1] =18;
        a[0][2] =28;

        a[1][0] =71;
        a[1][1] =72;
        a[1][2] =73;

        a[2][0] =88;
        a[2][1] =98;
        a[2][2] =38;

        a[3][0] =48;
        a[3][1] =58;
        a[3][2] =68;

        a[4][0] =72;
        a[4][1] =74;
        a[4][2] =76;


        System.out.println("rows="+a.length); // rows
        System.out.println("columns="+a[0].length);// col

        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }

            System.out.println();
        }

    }
}
