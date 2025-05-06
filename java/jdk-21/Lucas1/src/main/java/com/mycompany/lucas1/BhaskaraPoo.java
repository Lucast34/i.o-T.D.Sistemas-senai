/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lucas1;

/**
 *
 * @author luy
 */
public class BhaskaraPoo {
    private double a,b,c;

    public BhaskaraPoo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

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
    
    public double Delta(){
       return Math.pow(getB(),2)+(-4*(getA()*getC()));   
    }
    
    public String Raiz(){
        double delta = Delta();
        
        if(delta>0){
            double X1 = ((-getB())+ Math.sqrt(delta))/2*a;
            double X2 = ((-getB())- Math.sqrt(delta))/2*a;
            
            return String.format("\nDelta:%02f\nx1:%02f\nn2:%02f",delta,X1,X2);
        }else{
            return "Não existe raiz";
            
        }
    }
}
