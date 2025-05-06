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
    public int a,b,c;

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
       boolean j;
       
       if(a<b+c && b<c+a && c<b+a){
           if(a == b && a == c && b == c){
               String response = "Triângulo escaleno";
               return response;
           }else if(a == b || a == c || b == c){
               String response = "Triângulos isosceles";
               return response;
           }else{
               String response = "Triângulo escaleno";
               return response;
           }
       }
       else{
           String response = "Não existe triângulo";
           return response;
       }
       
   }
    
}
