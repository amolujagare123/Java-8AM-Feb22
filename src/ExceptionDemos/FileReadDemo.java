package ExceptionDemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReadDemo {

    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream fis = new FileInputStream("D:\\amol1.txt");

        System.out.println("End of the program");

    }
}
