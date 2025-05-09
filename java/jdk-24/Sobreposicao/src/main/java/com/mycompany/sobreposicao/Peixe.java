/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sobreposicao;

/**
 *
 * @author ead
 */
public class Peixe extends Animal {
    private String corEscama;

    public Peixe(String corEscama, double peso, int idade, String menbros) {
        super(peso, idade, menbros);
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    public void soltarBolha(){
        System.out.println("blub blub blub");
    }

    @Override
    public void emitirSom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Peixe{" + "corEscama=" + corEscama + '}';
    }
    
    
    
}
