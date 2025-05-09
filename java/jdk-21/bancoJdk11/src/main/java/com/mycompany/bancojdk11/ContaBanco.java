/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancojdk11;

/**
 *
 * @author luy
 */
public class ContaBanco extends Pessoa{
    private int numConta;
    private String tipo;
    private double saldo;
    private String status;

    public ContaBanco(int numConta, String tipo, double saldo, String status, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.numConta = numConta;
        this.tipo = tipo;
        this.saldo = saldo;
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
