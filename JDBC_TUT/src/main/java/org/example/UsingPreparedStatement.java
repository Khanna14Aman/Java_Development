package org.example;
import java.sql.*;
public class UsingPreparedStatement {
    public static void main(String []args) throws Exception{
        String url = "jdbc:postgresql://localhost:1024/postgres";
        String userName = "postgres";
        String password = "aman";
        Connection con = DriverManager.getConnection(url, userName, password);
        System.out.println(con);
        int sid = 5;
        String name = "Sanskar";
        int age = 13;
        String insertQuery = "insert into student values (?,?,?)";  // If we would have used Statement instead of preparedStatement then instead of questiong mark we had to give variable name sid, name, age by using single or double colun here. And that will would be very much risky and pron to error.
        PreparedStatement st = con.prepareStatement(insertQuery);
        st.setInt(1,sid);
        st.setString(2,name);
        st.setInt(3,age);
        st.execute();
        System.out.println("value inserted");
        String readQuery = "select * from student";
        st = con.prepareStatement(readQuery);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt("sid")+" - "+rs.getString("name")+" - "+rs.getInt("age"));
        }
        con.close();;
    }
}
