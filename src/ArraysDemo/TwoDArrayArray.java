package ArraysDemo;

public class TwoDArrayArray {

    public static void main(String[] args) {

        String[][] stArr = {

                {"abc1","xyz1","pqr1"},
                {"abc2","xyz2","pqr2"},
                {"abc3","xyz3","pqr3"},
                {"abc4","xyz4","pqr4"},
                {"abc5","xyz5","pqr5"},
        };

        for (int i=0;i< stArr.length; i++)
        {
            for (int j=0; j< stArr[0].length ;j++)
            {
                System.out.print(stArr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
