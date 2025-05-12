/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfasse;

/**
 *
 * @author ead
 */
public class Interfasse {
    public static void main(String[] args) {
        Transporte car = new Carro();
        Transporte boat = new Barco();
        Transporte airplane = new Aviao();
        
        car.mover();
        boat.mover();
        airplane.mover();
    
    }
    
}
