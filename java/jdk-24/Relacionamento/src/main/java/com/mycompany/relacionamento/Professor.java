/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relacionamento;

/**
 *
 * @author ead
 */
public class Professor {
    String nome;
    Escola escola;
    
    Professor(String nome, Escola escola){
        this.nome = nome;
        this.escola = escola;
    }
    
    void mostrarDados(){
        System.out.println("Professor: "+nome+", Escola: "+escola.nome);
    }
    
}
