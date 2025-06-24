/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaswing;

import java.sql.Connection;
import java.sql.SQLException;

public class UsuarioDAO {
    private Connection connection;
    
    public UsuarioDAO(){
        this.connection = new ConnectionFactory().connectaBD();
    }
    
    public void criarUsuario(Usuario u) throws SQLException{
        
        String sql = "INSERT INTO tb_usuario(nome,email,telefone,tipo_usuario) "
                + "VALUES(?,?,?,?)";
        
        try{}catch{}finally{}
    
    
    }
    
}
