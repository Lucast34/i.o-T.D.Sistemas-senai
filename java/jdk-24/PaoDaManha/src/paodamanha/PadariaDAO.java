/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paodamanha;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PadariaDAO {
    
    private Connection connection;
    
    public PadariaDAO() {
        this.connection = new ConnectionFactory().connectaBD();
    }
    
    public PadariaDAO(Connection connection) {
        this.connection = new ConnectionFactory().connectaBD();
    }
    
    public void criarPadaria(Padaria padaria)throws SQLException{
        String sql = "INSERT INTO  tb_adaria(nome,email,telefone)"
                + "values(?,?,?)";
        
        PreparedStatement pstmt;
            pstmt = null;
        
        try {
            
            pstmt = connection.prepareStatement(sql);
           
            pstmt.setString(1,padaria.getNome());
            pstmt.setString(2,padaria.getEmail());
            pstmt.setString(3,padaria.getTelefone());

            
            pstmt.executeUpdate();
            
            
        } catch (SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        finally{
            
            if(pstmt != null){
                pstmt.close();
            }
        }
        
    }
    public List<Padaria> listarPadarias() throws SQLException{
        
        List<Padaria> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM tb_padaria";
        
        PreparedStatement pstm;
            pstm = null;
        
        ResultSet rs = null;
        
        try {
            pstm = connection.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                Padaria padaria = new Padaria();
                
                padaria.setId(rs.getInt("id"));
                padaria.setNome(rs.getString("nome"));
                padaria.setEmail(rs.getString("email"));
                padaria.setTelefone(rs.getString("telefone"));
                
                
                lista.add(padaria);
                
            }
            
        } catch (SQLException e) {
            System.out.println("ERRO: "+e.getMessage());
            
        } finally {
            if(rs != null && pstm != null){
                rs.close();
                pstm.close();
            }
        }
        return lista;
       
    }
    public Padaria bucasPadariaPorId(int id) throws SQLException{
        String sql = "SELECT * FROM tb_padaria WHERE id=?";
        
        PreparedStatement pstm;
            pstm = null;
          
        ResultSet rs = null;
        Padaria padaria = null;
        
        try {
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            
            if (rs.next()){
                padaria = new Padaria();
                
                padaria.setId(rs.getInt("id"));
                padaria.setNome(rs.getString("nome"));
                padaria.setEmail(rs.getString("email"));
                padaria.setTelefone(rs.getString("telefone"));
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if(rs != null && pstm != null){
                rs.close();
                pstm.close();
            }    
        }
        return padaria;
        
    }
    public void atualizarPadaria(Padaria padaria) throws SQLException{
        String sql = "UPDATE tb_padaria SET nome = ?, email = ? , "
                + "telefone= ? WHERE id = ? ";
        
        PreparedStatement pstmt;
            pstmt = null;
            
        try {
            
            pstmt = connection.prepareStatement(sql);
           
            pstmt.setString(1,padaria.getNome());
            pstmt.setString(2,padaria.getEmail());
            pstmt.setString(3,padaria.getTelefone());
          
            
            int linhaAfetadas = pstmt.executeUpdate();
            
            if (linhaAfetadas > 0) {
                System.out.println("Leitura concluida");
            } else {
                System.out.println("Padaria não foi encontrado");
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR: "+e.getMessage());
        } finally {
            if(pstmt != null)pstmt.close();
        
        }
    }
    
    public void deletePadaria(int id) throws SQLException{
        String sql = "DELETE FROM tb_padaria WHERE id = ?";
        
        PreparedStatement pstm;
            pstm = null;
            
        try {
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1,id);
            
            pstm.executeUpdate();
            
            System.out.println("Padaria deletado com sucesso");
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if(pstm != null)pstm.close();
        }
        
    }
    
}
