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
    
    public List<Carro> listarCarro() throws SQLException{
        List<Carro> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM tb_carro";
        
        PreparedStatement pstm;
        pstm = null;
        
        ResultSet  rs;
        rs = null;
        
        try {
            pstm = conn.prepareCall(sql);
            
            rs = pstm.executeQuery();
            
            while (rs.next()){
                Carro carro = new Carro();
                
                carro.setMarca(rs.getString("marca"));
                carro.setAno(rs.getInt("ano"));
                carro.setTipo(rs.getString("tipo"));
                carro.setPortas(rs.getInt("porta"));
                
                lista.add(carro);
            }
        } catch (SQLException e) {
            System.out.println("ErrorCrDAOList:"+e.getMessage());
        } finally {
            if(pstm != null && rs != null){pstm.close(); rs.close();} 
        }
       return lista;
    }
    
    public Carro buscarPorId(int id) throws SQLException{        
        String sql = "SELECT * FROM tb_usuario WHERE id = ?"; 
        
        PreparedStatement pstm;
        pstm = null;
        
        ResultSet rs;
        rs = null;
        
        Carro carro = null;
        try{ 
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, id);
            
            rs = pstm.executeQuery();
            
            if(rs.next()){
                carro = new Carro();
            
                carro.setMarca(rs.getString("marca"));
                carro.setAno(rs.getInt("Ano"));
                carro.setTipo(rs.getString("tipo"));
                carro.setPortas(rs.getInt("portas"));
            }
        }catch(SQLException e){
            System.out.println("ErrorCrDAOSearchId:"+e.getMessage());
        }finally{
            if(pstm != null && rs != null){pstm.close(); rs.close();}
        }
        return carro;
    }
}
