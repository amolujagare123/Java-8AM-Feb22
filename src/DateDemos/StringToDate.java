package DateDemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

    public static void main(String[] args) throws ParseException {

        String dateStr = "12/04/2019";

        // String into date --> parse

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sd.parse(dateStr);
        System.out.println(date);

        String dateStr1= "23 | June 16  8:34" ;
        //→ dd | MMMM yy hh:mm
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println(date1);


        String dateStr2= "2019-07-23 | 8:34:23";
        //→ yyyy-MM-dd | hh:mm:ss
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        Date date2 = sd2.parse(dateStr2);
        System.out.println(date2);

       // System.out.println(dateStr2);

        String dateStr3= "Thursday 2016/06/23";
        //→ EEEE yyyy/MM/dd
        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        Date date3 = sd3.parse(dateStr3);
        System.out.println(date3);

        String dateStr4= "23-06-2016 | Thu | 8:34" ;
        //→ dd-MM-yyyy | E | hh:mm
        SimpleDateFormat sd4 = new SimpleDateFormat("dd-MM-yyyy | E | hh:mm");
        Date date4 = sd4.parse(dateStr4);
        System.out.println(date4);

        String dateStr5= "8:34:22";
        //→ hh:mm:ss
        SimpleDateFormat sd5 = new SimpleDateFormat("hh:mm:ss");
        Date date5 = sd5.parse(dateStr5);
        System.out.println(date5);



    }


}
