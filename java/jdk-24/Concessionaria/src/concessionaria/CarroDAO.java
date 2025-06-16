package concessionaria;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class CarroDAO {
    private Connection conn;

    public CarroDAO(Connection connection) {
        this.conn = new ConnectionFactory().conectaDB();
    }
    
    public void adicionarCarro(Carro carro)throws SQLException{
        String sql = "INSERT INTO tb_carro(marca,ano,tipo,portas) VALUES(?,?,?,?)";
        
        PreparedStatement pstm ;
        pstm = null;
        
        try {
            pstm = conn.prepareCall(sql);
            
            pstm.setString(1, carro.getMarca());
            pstm.setInt(2, carro.getAno());
            pstm.setString(3,carro.getTipo() );
            pstm.setInt(4, carro.getPortas());
            
            pstm.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("ErrorCrDAOAdd:"+e.getMessage());
        }finally{
            if(pstm != null)pstm.close();
        }
        
        
    }
}
