/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lucas1;

/**
 *
 * @author luy
 */
public class ImparPar {
    private int a;

    public ImparPar(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    public String ParImpar(){
        return (getA()%2==0)?"O numero é par":"numero é impar";
    };
    
    
}
