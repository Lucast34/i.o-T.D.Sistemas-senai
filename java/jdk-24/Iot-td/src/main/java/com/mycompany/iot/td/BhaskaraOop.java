/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iot.td;

/**
 *
 * @author ead
 */
public class BhaskaraOop {
    private double a,b,c;
    //protected double delta;
    //protected double x1,x2;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public BhaskaraOop() {
        this.a = 2;
        this.b = 6;
        this.c = -16;
    }
    
    

    
    public double calcularDelta(){
        return  Math.pow(this.getB(),2)+(-4*(this.getA()*this.getC()));
    }
    
    public void calculaRaiz(){
        
        double delta = calcularDelta();
        
        if(delta<0){
            System.out.println("Não existe raiz real");
        }else{
            double x1 = ((-(this.getB()) + Math.sqrt(delta))/2*this.getA());
            double x2 = ((-(this.getB()) - Math.sqrt(delta))/2*this.getA());
            
            System.out.format("\nDelta: %.02f\nx1: %.02f\nx2: %.02f",delta,x1,x2);
            
        }
        
    }
    
    
   
    
}  
