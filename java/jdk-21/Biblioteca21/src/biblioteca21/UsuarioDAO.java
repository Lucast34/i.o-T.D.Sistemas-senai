/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca21;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//import org.mariadb.jdbc.client.result.ResultSetMetaData;

public class UsuarioDAO {
    private Connection connection;
    
    public UsuarioDAO(){
        this.connection = new ConnectionFactory().connectaDB();
    }
    
    public void criarUsuario(Usuario usuario) throws  SQLException{
        String sql = "INSERT INTO  tb_usuario(nome,email,telefone,tipo_usuario)"
                + "values(?,?,?,?)";
        
        PreparedStatement pstmt;
            pstmt = null;
        
        try {
            
            pstmt = connection.prepareStatement(sql);
           
            pstmt.setString(1,usuario.getNome());
            pstmt.setString(2,usuario.getEmail());
            pstmt.setString(3,usuario.getTelefone());
            pstmt.setString(4,usuario.getTipo_usuario());
            
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
    
    public List<Usuario> listarUsuarios() throws SQLException{
    
        List<Usuario> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM tb_usuario";
        
        PreparedStatement pstm;
            pstm = null;
            
        ResultSet rs = null;
        
        try {
            pstm = connection.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setId(rs.getInt("telefone"));
                usuario.setId(rs.getInt("tipo_usuario"));
                
                lista.add(usuario);
            
            }
        } catch (SQLException e) {
            System.out.println("Error:"+e.getMessage());
            
        } finally {
            if(rs != null)rs.close();
            if(pstm != null)pstm.close();
        }
        
        return lista;
    }
    
    public Usuario buscarUsuarioPorId(int id) throws SQLException{ 
        String sql = "SELECT * FROM tb_usuario WHERE id = ?";
        
        PreparedStatement pstm;
            pstm = null;
            
        ResultSet rs = null;
        
        Usuario usuario = null;
        
        
        try {
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1, id);
            
            rs= pstm.executeQuery();
            
            if(rs.next()){
                usuario = new Usuario();
                
                usuario.setId(rs.getInt("Id"));
                usuario.setNome((rs.getString("Nome")));
                usuario.setEmail((rs.getString("Email")));
                usuario.setTelefone((rs.getString("Telefone")));
                usuario.setTipo_usuario((rs.getString("Tipo_usuario")));
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }finally{
            if(rs != null && pstm != null){
                rs.close();
                pstm.close();
            }
        }
        return usuario;   
    }
    
    public void atualizarUsuario(Usuario usuario)throws SQLException{
        String sql = "UPDATE tb_usuario SET nome = ?, telefone = ?, "
                + "tipo_usuario = ? WHERE id = ?"; 
        
        PreparedStatement pstmt;
        pstmt = null;
        
        try {
            pstmt = connection.prepareStatement(sql);
            
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getEmail());
            pstmt.setString(1, usuario.getTelefone());
            pstmt.setString(1, usuario.getTipo_usuario());
            
            int linhaAfetadas = pstmt.executeUpdate();
            
            if (linhaAfetadas > 0){
                System.out.println("Leitura concluída");
            }else{
                System.out.println("Usuario não foi encontrado");
            }
            
        }catch (SQLException e) {
            System.out.println("ERROR:"+e.getMessage());
        }finally{
            if(pstmt != null)pstmt.close();
        }
        
    }
    
    public void deleteUsuario(int id)throws SQLException{
        String sql = "Delete from tb_usuario WHERE id = ?";
        
        PreparedStatement pstm;
            pstm = null;
            
        try {
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1,id);
            
            pstm.executeUpdate();
            
            System.out.println("Usuario deletado com sucessp");
            
        } catch (SQLException e) {
            System.out.println("ERROR: "+e.getMessage());
            
        } finally {
            if(pstm != null) pstm.close();
        }
    }
    
}
