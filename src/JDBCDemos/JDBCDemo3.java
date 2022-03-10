package JDBCDemos;

import java.sql.*;

public class JDBCDemo3 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. Loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. create connection
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/8ambatch";

        Connection con = DriverManager.getConnection(url,username,password);

        // 3. create statement
        Statement st = con.createStatement();

        // 4. executing the query

        // DDL  - Data Definition language - select

        String sql ="select rno,firstName from candidate";

        ResultSet rs = st.executeQuery(sql); // DDL queries

        while(rs.next())
        {
          /*  System.out.print(rs.getInt("rno") +"\t");
            System.out.print(rs.getString("firstName")+"\t");*/
          /*  System.out.print(rs.getString("branch")+"\t");
            System.out.print(rs.getString("email")+"\t");
            System.out.println(rs.getString("phone"));*/

           for (int i=1;i<=2;i++)
            {
                System.out.print(rs.getString(i)+"\t");
            }
            System.out.println();
            System.out.println();
        }


    }
}
