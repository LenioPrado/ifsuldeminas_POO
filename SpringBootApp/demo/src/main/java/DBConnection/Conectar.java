package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conectar {

    public static void main(String[] args) throws Exception
    {
        //String url = "jdbc:mysql://localhost:3306/school"; // database URL
        String url = "jdbc:postgresql://localhost:5432/poo";
        String username = "postgres";
        String password = "1234";
        
        try{
 
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection successful...");
        
        String query= "select * from person";
 
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        System.out.printf("Id: %s. Nome: %s. Idade: %s\n", rs.getString("id"), rs.getString("name"), rs.getString("age"));
        
        rs.close();
        st.close();
        con.close();
        System.out.println("Connection closed....");
 
        } catch (Exception e){
            System.out.println(e);
        }
    
    }
} 