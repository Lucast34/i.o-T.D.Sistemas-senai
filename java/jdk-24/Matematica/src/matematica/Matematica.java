/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematica;

public class Matematica {
    
    private double a,b,c;

    public Matematica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        
    }
        
    public double soma(double a, double  b){
        return a+b;
    }
    
    public String parImpar(int a){       
       String resultado = (a %2 == 0)?"Par":"Impar";
       
       return resultado;
    }
    
    public double bhaskaraDelta(){
        return (Math.pow(b, 2)+(-4*(a*c)));
    }
    
    public double bhaskaraX1(){
        double delta = bhaskaraDelta(a, b, c);
        return ((-b)+ Math.sqrt(delta))/2*a;
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
    
    
}
