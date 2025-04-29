/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iot.td;

/**
 *
 * @author ead
 */
public class CanetaMain {
    public static void main(String[] args) {
        
        Caneta can = new Caneta();
        
        can.setModelo("Bic");
        
        can.setCor("Azul");
        
        can.setCarga(10);
        
        can.setPonta(0.5f);
        
        System.out.println(can.getModelo());
        
        System.out.println(can.getCor());
        
        System.out.println(can.getCarga());
        
        System.out.println(can.getPonta());
        
        Caneta panda = new Caneta();
        
        panda.modelo = "Urso";
        panda.cor  = "Preto";
        panda.carga = 5;
        panda.ponta = 00f;
        
            System.out.println(panda.getModelo());
        
            System.out.println(panda.getCor());
        
            System.out.println(panda.getCarga());
        
            System.out.println(panda.getPonta());
        
    }
}
