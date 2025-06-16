package concessionaria;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionFactory {
    Connection conn;
    
    public Connection conectaDB(){
    
        String url = "jdbc:mysql://localhost:3306/db_concessionaria?useSS1=false";
        String user = "root";
        String password = "";
        
        try {
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("Conectado");
        } catch (SQLException e) {
            System.out.println("ErrorConnectionFactory:"+e.getMessage());
            
        }
    return conn;
    }
}
