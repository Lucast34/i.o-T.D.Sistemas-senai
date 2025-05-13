/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sobrecarga;

/**
 *
 * @author ead
 */
public class Calculo {
    
    public void metric(int a){
        System.out.println((a % 2 == 0)?"É par":"É impar");
    }
    
    public void metric(int a, int b){
        System.out.println(a+b);
        
    }
    
    public void metric(double a, double b, double c){
        double delta = Math.pow(b, 2) +(-4*(a*c));
        
        if (delta >= 0){
            double xa = (((-b) + Math.sqrt(delta))/2*a);
            double xb = (((-b) - Math.sqrt(delta))/2*a);
            
            System.out.format("Delta: %.1f\nX1: %.1f\nx2: %.1f\n",delta,xa,xb);
            
        }else{
            System.out.println("Raiz não existe");
        }
        
    }
    
    public void metric(float a , float b, float c, float d){
        System.out.println((a+b+c+d)/4);
    }
}
