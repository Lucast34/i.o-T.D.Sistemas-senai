/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iot.td;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ead
 */
public class ImPar {
    
    private int numIp;

    public ImPar(int numIp) {
        this.numIp = numIp;
    }
    
    public int getNumIp() {
        return numIp;
    }

    public void setNumIp(int numIp) {
        this.numIp = numIp;
    }
    
    public String VerificarImPar(){
        
        String response =(this.getNumIp()% 2 == 0)?"O numero " 
            +this.getNumIp()+" é par":"O numero "+this.getNumIp()+ "é impar ";
        
        return response;
        
    
    } 
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um numero >> ");
        
        int numero= input.nextInt();
        
        ImPar Ip = new ImPar(numero);
        
        System.out.println(Ip.VerificarImPar());
    }

    
    
     
    
}
