package ArraysDemo;

public class CharTwoDArray {

    public static void main(String[] args) {

        char[][] ch = {
                {'z','x','c'},
                {'!','@','#'},
                {'1','2','3'},
                {'A','B','C'},
                {'g','j','l'},
        };

        for (int i=0;i<ch.length;i++)
        {
            for (int j=0;j<ch[0].length;j++)
            {
                System.out.print(ch[i][j]+" ");
            }
            System.out.println();
        }
    }
}
