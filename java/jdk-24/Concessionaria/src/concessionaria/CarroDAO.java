/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionaria;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CarroDAO {
    private Connection connection;

    public CarroDAO(){
        this.connection = new ConnectionFactory().connectaBD();
    }
    
    public void criarCarro(Carro carro) throws SQLException{
        String sql= "INSERT INTO tb_carro(marca,ano,tipo,portas)"
                + "values(?,?,?,?)";
        
        PreparedStatement pstm;
            pstm = null;
        
        try {
            
            pstm = connection.prepareStatement(sql);
            
            pstm.setString(1, carro.getMarca());
            pstm.setInt(2, carro.getAno());
            pstm.setString(3, carro.getTipo());
            pstm.setInt(4, carro.getPorta());
            
            pstm.execute();
            
        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
        } finally {
            if(pstm != null)pstm.close();
        }
    }
        
        
    public List<Carro> listarCarros() throws SQLException{
        
        List<Carro> list = new ArrayList<>();
        
        String sql = "SELECT * FROM tb_carro";
        
        PreparedStatement pstm;
            pstm = null;
        
        ResultSet rs = null;
        
        try {
            pstm = connection.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                Carro car = new Carro();
                
                car.setId();
                
            }
            
        } catch (Exception e) {
        } finally {
        }
    }
}

