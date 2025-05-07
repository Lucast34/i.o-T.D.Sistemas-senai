/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lucas;

import java.time.LocalDate;
import java.time.Period;



public class Pessoa {
    private String nome,cpf;
    private LocalDate dataNascimeto;
    private double altura,peso;

    public Pessoa(String nome, String cpf, LocalDate dataNascimeto, double altura, double peso) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimeto = dataNascimeto;
        this.altura = altura;
        this.peso = peso;
    }
        
    //imc
    public double imc(){
        if(altura<=0){
            throw new IllegalArgumentException("A ALTURA TEM "
                    + "QUE SER MAIOR QUE ZERO");
        }
        return this.getPeso()/Math.pow(this.getAltura(),2);
    }
    
    //Maior idade
    public boolean isMaiorIdade(){
        
        LocalDate hoje = LocalDate.now();
        
        Period idade = Period.between(this.getDataNascimeto(), hoje);
       
        return idade.getYears()>=18;
    }
    
    public String getNome() {
        return nome;
    }
    //Salvar
    public String toCSV(){
        return this.getNome()+";"+this.getDataNascimeto()+";"+this.getAltura()
                +";"+this.getPeso()+":"+String.format("%.2f", imc())
                +";"+(isMaiorIdade()?"sim":"não");
        //return String.format("%s;", args)
    }
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimeto() {
        return dataNascimeto;
    }

    public void setDataNascimeto(LocalDate dataNascimeto) {
        this.dataNascimeto = dataNascimeto;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
