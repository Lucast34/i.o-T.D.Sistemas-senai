package com.mycompany.animal;

public class Animal {
    private double peso;
    private int idade;
    private String menbros;

    public Animal(double peso, int idade, String menbros) {
        this.peso = peso;
        this.idade = idade;
        this.menbros = menbros;
    }
    

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMenbros() {
        return menbros;
    }

    public void setMenbros(String menbros) {
        this.menbros = menbros;
    }

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", idade=" + idade + ", menbros=" + menbros + '}';
    }
    
    
}
