/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionaria;

import java.util.Date;

/**
 *
 * @author ead
 */
public class Carro {
    private String marca;
    private boolean tipo;
    private Date ano;
    private int porta;

    public Carro(String marca, boolean tipo, Date ano, int porta) {
        this.marca = marca;
        this.tipo = tipo;
        this.ano = ano;
        this.porta = porta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }
    
    
}
