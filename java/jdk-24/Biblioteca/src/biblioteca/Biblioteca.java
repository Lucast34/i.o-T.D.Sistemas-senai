/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.sql.SQLException;

/**
 *
 * @author ead
 */
public class Biblioteca {

    
    public static void main(String[] args){
        
        UsuarioDAO userDAO = new UsuarioDAO();
        
        Usuario usr = new Usuario(0, "Jubileu", "jublieu@email.com", "61 9919965"
                ,"De mentirinha");
        
        
        try {
            userDAO.criarUsuario(usr);
            System.out.println("Adicionado");
            
        } catch (SQLException e) {
            System.out.println("Erro: "+ e.getMessage());
        }   
    }
}
