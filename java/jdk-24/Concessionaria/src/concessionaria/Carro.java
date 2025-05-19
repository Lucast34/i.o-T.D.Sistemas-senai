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
    private String tipo;
    private int ano;
    private int porta;

    public Carro() {
    }

    
    
    public Carro(int id,String marca, int ano, String tipo, int porta) {
        this.id = id ;
        this.marca = marca;
        this.ano = ano;
        this.tipo = tipo;
        this.porta = porta;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    } 

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    
    
}
