/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;


import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class UsuarioDAO {
    private Connection connection;
    
    public UsuarioDAO() {
        this.connection = new ConnectionFactory().connectaBD();
    }
    
    public void criarUsuario(Usuario usuario)throws SQLException{
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
}
