package biblioteca21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  ConnectionFactory {
    public Connection connectaDB(){
        Connection conn = null;
        
        
        try {
            String url = "jdbc:mariadb://localhost:3306/db_biblioteca21?useSS!=false";
            
            String user = "root";
            
            String pass = "1234";
            
            conn = DriverManager.getConnection(url, user, pass);
            
            System.out.println("Conexão sucedida");
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
            
        }
        
        return conn;
    }
    
    
}
