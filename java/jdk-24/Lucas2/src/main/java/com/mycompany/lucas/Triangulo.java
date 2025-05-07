package com.mycompany.lucas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ead
 */
public class Triangulo {
    private int a,b,c;

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

   public String VerifcarTriangulo(){
              
       String response = null;
       
        if(getA()<getB()+getC() && getB()<getC()+getA() && getC()<getB()+getA()){
            if(getA() == getB() && getA() == getC() && getB() == getC()){
               response = "Triângulo escaleno";
               
           }else if(getA() == getB() || getA() == getC() || getB() == getC()){
               response = "Triângulos isosceles";
               
           }else if (getA() != getB() && getA() != getC() && getB() != getC()){
               response= "Triângulo escaleno";
               
           }
       }
        else{
           response = "Não existe triângulo";
           
       }
       return response;
       
   }
   
}
