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
                
                car.setId(rs.getInt("id"));
                car.setMarca(rs.getString("Marca"));
                car.setAno(rs.getInt("Ano"));
                car.setTipo(rs.getString("Tipo"));
                car.setPorta(rs.getInt("Portas"));
                
                list.add(car);
            }
            
        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
        } finally {
            if(rs!= null && pstm != null){
                rs.close();
                pstm.close();
            }
            
        }
        return list;
    }
    
    public Carro buscaUsuarioPorId(int id) throws SQLException{
        String sql = "SELECT * FROM tb_carro WHERE id=?";
        
        PreparedStatement pstm;
                pstm = null;
        
        ResultSet rs = null;
        
        Carro car = null;
        
        try {
            
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1, id);
            
            rs = pstm.executeQuery();
            
            if (rs.next()) {
                
                car = new Carro();
                
                car.setId(rs.getInt("id"));
                car.setMarca(rs.getString("marca"));
                car.setAno(rs.getInt("ano"));
                car.setTipo(rs.getString("tipo"));
                car.setPorta(rs.getInt("Portas"));
            }
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
            
        } finally {
            if(rs != null && pstm != null){
                rs.close();
                pstm.close();
            }
        }
        
        return car;
    }
    
    public void atualizarUsuario(Carro car)throws SQLException{
        String sql = "UPDATE tb_usuario SET marca = ?, ano = ?, "
                + "tipo = ?, portas = ? WHERE id = ?";
        
        PreparedStatement pstm;
            pstm = null;
            
        try {
            
            pstm = connection.prepareCall(sql);
            
            pstm.setString(1, car.getMarca());
            pstm.setInt(2, car.getAno());
            pstm.setString(3, car.getTipo());
            pstm.setInt(4, car.getPorta());
            
            int linhaAfetadas = pstm.executeUpdate();
            
            if(linhaAfetadas > 0){
                System.out.println("Leitura concluida");
            }else{
                System.out.println("Usuario não foi encontrado");
            }
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        } finally{
            if(pstm != null)pstm.close();
        }
    }
    
    public void deletarCarro(int id) throws SQLException{
        String sql = "DELETE FROM tb_carro WHERE id = ?";
        
        PreparedStatement pstm;
            pstm = null;
            
        try {
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1,id);
            
            pstm.executeUpdate();
            
            System.out.println("Carro deletado com sucesso");
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if(pstm != null)pstm.close();
        }
    
    }
}

