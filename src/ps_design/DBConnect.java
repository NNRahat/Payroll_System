package ps_design;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    Connection conn = null;
    public static Connection DBConnect(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project_payroll","root","");           
            return conn;            
        }catch(Exception ex) {
            // If connection fail
            System.out.println("Erro: " + ex);
            return null;
        }

    }
}