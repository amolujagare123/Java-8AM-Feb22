package ExceptionDemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReadDemo {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("D:\\amol.txt");

       /* try {
            FileInputStream fis = new FileInputStream("D:\\amol.txt");
        }
        catch (Exception e)
        {

        }*/
        System.out.println("End of the program");

    }
}
