package JDBCDemos;

import java.sql.*;

public class JDBCDemo2 {

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

        String sql ="select * from student1";

        ResultSet rs = st.executeQuery(sql); // DDL queries

        while(rs.next())
        {
           /* System.out.print(rs.getInt("rno") +"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));*/

            for (int i=1;i<=4;i++)
            {
                System.out.print(rs.getString(i)+"\t");
            }
            System.out.println();
        }


    }
}
