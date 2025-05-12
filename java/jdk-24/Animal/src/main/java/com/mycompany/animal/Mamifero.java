package com.mycompany.animal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ead
 */
public abstract class Mamifero extends Animal{
    private String corPelo;

    public Mamifero(String corPelo, double peso, int idade, String menbros) {
        super(peso, idade, menbros);
        this.corPelo = corPelo;
    }
    
    public abstract void reagir();
    public abstract void emitirSom();

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "corPelo=" + corPelo + '}';
    }
    
    
    
}
