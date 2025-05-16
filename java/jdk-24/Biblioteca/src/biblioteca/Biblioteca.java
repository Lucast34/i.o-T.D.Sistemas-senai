/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;

/**
 *
 * @author ead
 */
public class Biblioteca {

    
    public static void main(String[] args){
        //boolean val= true;
        
        UsuarioDAO userDAO = new UsuarioDAO();
//        
//        //while(val)
//            
//        Usuario usr = new Usuario(0, "Creuza", "creuza@email.com", "61 95555555"
//                ,"Desativado");
//        
//        Usuario usrNull = new Usuario();
//        
//        try {
//            userDAO.criarUsuario(usr);
//            System.out.println("Adicionado");
//            
//        } catch (SQLException e) {
//            System.out.println("Erro: "+ e.getMessage());
//        }   
//        
//        try {
//            List<Usuario> usuarios = userDAO.listarUsuarios();  
//            if(usuarios.isEmpty()){
//                System.out.println("A lista esta Vazia");
//            }else{
//                for(Usuario usuario : usuarios){
//                    System.out.println("ID: "+usuario.getId());
//                    System.out.println("Nome: "+usuario.getNome());
//                    System.out.println("Email: "+usuario.getEmail());
//                    System.out.println("Telefone: "+usuario.getTelefone());
//                    System.out.println("Tipo: "+usuario.getTipo_usuario());
//                    System.out.println("________________X_______________");
//                }
//            }
//            
//        } catch (SQLException e) {
//            System.out.println("Erro: "+e.getMessage());
//            
//        }

//        try {
//            
//            int idBucador =2;
//            
//            Usuario usuario = userDAO.bucasUsuarioPorId(idBucador);
//            
//            if(usuario!= null){
//                System.out.println("O usuario foi encontrado");
//            
//            
//                System.out.println("ID: "+usuario.getId());
//                System.out.println("Nome: "+usuario.getNome());
//                System.out.println("Email: "+usuario.getEmail());
//                System.out.println("Telefone: "+usuario.getTelefone());
//                System.out.println("Tipo: "+usuario.getTipo_usuario());
//                System.out.println("________________X_______________");
//            }
//            else{
//                System.out.println("O usuario não foi encontrado -> id:"+idBucador);
//            } 
//        }catch (SQLException e) {
//            System.out.println("Erro: "+e.getMessage());
//        }
        
        Connection connection = null;
        
        try {
            connection = new ConnectionFactory().connectaBD();
            
            UsuarioDAO dao = new UsuarioDAO(connection);
            
            Usuario usrAtualizado = new Usuario();
            
            usrAtualizado.setId(1);
            usrAtualizado.setNome("Galiandra");
            usrAtualizado.setEmail("galiandra@email.com");
            usrAtualizado.setTelefone("61-988888");
            usrAtualizado.setTipo_usuario("bicno");
            
            dao.atualizarUsuario(usrAtualizado);
            
        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
        }finally{
            try {
                if(connection != null) connection.close();
                
            } catch (SQLException e) {
                System.out.println("Erro: "+e.getMessage());
            }
        }
        
    }
}
