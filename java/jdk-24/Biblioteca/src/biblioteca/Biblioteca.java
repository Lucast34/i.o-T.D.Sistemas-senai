/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ead
 */
public class Biblioteca {

    
    public static void main(String[] args){
        //boolean val= true;
        
        UsuarioDAO userDAO = new UsuarioDAO();
        
        //while(val)
            
        Usuario usr = new Usuario(0, "Creuza", "creuza@email.com", "61 95555555"
                ,"Desativado");
        
        Usuario usrNull = new Usuario();
        
        try {
            userDAO.criarUsuario(usr);
            System.out.println("Adicionado");
            
        } catch (SQLException e) {
            System.out.println("Erro: "+ e.getMessage());
        }   
        
        try {
            userDAO.listarUsuarios();
            
            
        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
            
        }
    }
}
