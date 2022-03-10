package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

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
        // insert / update / delete / select
        // DML - Data manipulation language - insert / update / delete
        // DDL  - Data Definition language - select

       // String sql = "insert into student1 values(3,'Ashish','Comp',78)";
     //   String sql = "update student1 set name='Amar',branch='IT' ,marks=100 where rno=3 ";
        String sql = "delete from student1 where rno=3";

        st.executeUpdate(sql); // DML queries


    }
}
