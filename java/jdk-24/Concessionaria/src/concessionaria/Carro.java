/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionaria;

/**
 *
 * @author ead
 */
public class Carro {
    private int id;
    private String marca;
    private int ano;
    private String tipo;
    private int portas;
    
    // Cheio
    public Carro(int id, String marca, int ano, String tipo, int portas) {
        this.id = id;
        this.marca = marca;
        this.ano = ano;
        this.tipo = tipo;
        this.portas = portas;
    }
    
    // Vazio

    public Carro() {
    }
    
    
    // getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
    
    
}
