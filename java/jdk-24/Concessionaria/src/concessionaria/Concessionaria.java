/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concessionaria;

import java.sql.SQLException;

public class Concessionaria {


    public static void main(String[] args) {
        
        CarroDAO carDAO = new CarroDAO();
             
        Carro car = new Carro(0, "audi", 2016, "A7", 4);

        
        
        try {
            carDAO.criarCarro(car);
            System.out.println("O Carro foi adcionado");
            
        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
            
        }
        
    }
    
}
