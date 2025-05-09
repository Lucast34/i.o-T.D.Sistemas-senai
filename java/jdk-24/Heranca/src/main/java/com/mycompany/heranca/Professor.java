/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author ead
 */
public class Professor extends Pessoa{
    private double salario;
    private String especialidade;

    
    public void aumento(){
        System.out.println("5.000,00");
        
    }
    
    public Professor(double salario, String especialidade, String nome, int idade, char sexo) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void fazerAniv() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String toString() {
        return super.toString()+"Escola{" + "salario=" + salario + ", especialidade=" + especialidade + '}';
    }
    
    
    
    
    
    
}
