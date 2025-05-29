/*
 * Click nbfs:nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs:nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca21;

import java.sql.SQLException;
import java.util.List;




public class Biblioteca21 {
    
    
    
    public static void main(String[] args) {
        
         UsuarioDAO userDAO = new UsuarioDAO();
        
        ConnectionFactory connF = new ConnectionFactory();
        connF.connectaDB();
        
        Usuario usr = new Usuario(0, "TestName", "Test@gmail.com", "61 95555555"
               ,"Desativado");
        
        try {
            userDAO.criarUsuario(usr);
            System.out.println("Adicionado");
            
        } catch (SQLException e) {
            System.out.println("Erro: "+ e.getMessage());
        }   
        
        try {
            List<Usuario> usuarios = userDAO.listarUsuarios();  
            if(usuarios.isEmpty()){
                System.out.println("A lista esta Vazia");
            }else{
                for(Usuario usuario : usuarios){
                    System.out.println("ID: "+usuario.getId());
                    System.out.println("Nome: "+usuario.getNome());
                    System.out.println("Email: "+usuario.getEmail());
                    System.out.println("Telefone: "+usuario.getTelefone());
                    System.out.println("Tipo: "+usuario.getTipo_usuario());
                    System.out.println("________________X_______________");
                }
            }
            
        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
            
        }
        
    }
    
}
