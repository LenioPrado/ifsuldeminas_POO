package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conectar {
    public static void main(String[] args) throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/school"; // database URL
        String username = "root";
        String password = "pass4567";
        
        try{
 
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection successful...");
        
        String query= "select * from student";
 
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String firstName = rs.getString("fname");
        System.out.println(firstName);
        
        rs.close();
        st.close();
        con.close();
        System.out.println("Connection closed....");
 
        } catch (Exception e){
            System.out.println(e);
        }
    
    }
} {
    
}
