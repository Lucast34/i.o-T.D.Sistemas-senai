/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection connectaBD(){
        Connection conn = null;
        
        try {
            
            String url = "jdbc:mysql://localhost:3306/db_cinema?useSS1=false";
            String user = "root";
            String password = "";
            
            conn = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
            
        } 
        return conn;
    }
}
