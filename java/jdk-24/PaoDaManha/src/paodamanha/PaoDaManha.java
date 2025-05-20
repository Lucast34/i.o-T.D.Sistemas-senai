/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paodamanha;

import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;

public class PaoDaManha {

    public static void main(String[] args) {
        
        PadariaDAO paDAO = new PadariaDAO();
        
        Padaria pad = new Padaria(nome, email, telefone);
        
        //Usuario usrNull = new Usuario();
        
        try {
            paDAO.criarPadaria(pad);
            System.out.println("Adicionado");
            
        } catch (SQLException e) {
            System.out.println("Erro: "+ e.getMessage());
        }   
        
        try {
            List<Padaria> padarias = paDAO.listarPadarias();  
            if(padarias.isEmpty()){
                System.out.println("A lista esta Vazia");
            }else{
                for(Padaria padaria : padarias){
                    System.out.println("ID: "+padaria.getId());
                    System.out.println("Nome: "+padaria.getNome());
                    System.out.println("Email: "+padaria.getEmail());
                    System.out.println("Telefone: "+padaria.getTelefone());
                    System.out.println("________________X_______________");
                }
            }
            
        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
            
        }
        
    }
    
}
