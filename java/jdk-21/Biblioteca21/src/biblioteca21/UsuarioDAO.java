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
import org.mariadb.jdbc.client.result.ResultSetMetaData;

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
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
            
        } finally {
            if(rs != null)rs.close();
            if(pstm != null)pstm.close();
        }
        
        return lista;
    }
    
}
