package org.example;
import java.sql.*;
public class Main {
    public static void main(String [] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:1024/postgres";
        String userName = "postgres";
        String password = "khannass8";
        Connection con = DriverManager.getConnection(url, userName, password);
        System.out.println(con);
        Statement st = con.createStatement();
        String createTableQuery = "create table testing ( sid integer primary key, name text, age integer );";
        st.execute(createTableQuery);
        System.out.println("Table testing is created");
        String insertQuery = "insert into testing values (1,'aman',12), (2,'ekta',10), (3,'akshat',23);";
        st.execute(insertQuery);
        System.out.println("Inserted the values");
        String readQuery = "Select * from testing;";
        ResultSet rs = st.executeQuery(readQuery);
        while(rs.next()){
            System.out.println(rs.getInt("sid")+" - "+rs.getString("name")+" - "+rs.getInt("age"));
        }
        String updateQuery = "update testing set name = 'sanskar' where sid = 3;";
        st.execute(updateQuery);
        System.out.println("Table updated");
        rs = st.executeQuery(readQuery);;
        while(rs.next()){
            System.out.println(rs.getInt("sid")+" - "+rs.getString("name")+" - "+rs.getInt("age"));
        }
        String deleteQuery = "delete from testing where sid = 3;";
        st.execute(deleteQuery);
        System.out.println("row deleted");
        rs = st.executeQuery(readQuery);;
        while(rs.next()){
            System.out.println(rs.getInt("sid")+" - "+rs.getString("name")+" - "+rs.getInt("age"));
        }
        con.close();;
    }
}
