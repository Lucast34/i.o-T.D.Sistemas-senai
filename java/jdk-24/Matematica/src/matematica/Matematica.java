/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematica;

public class Matematica {
    public double soma(double a, double  b){
        return a+b;
    }
    
    public String parImpar(int a){       
       String resultado = (a %2 == 0)?"Par":"Impar";
       
       return resultado;
    }
    
    public String bhaskara(double a, double b, double c){
        double delta = (Math.pow(b, 2)+(-4*(a*c)));
        if (delta < 0){
            return "A raiz não existe";
        }else{
            double X1 = ((-b)+ Math.sqrt(delta))/2*a;
            double X2 = ((-b)- Math.sqrt(delta))/2*a;
            
            return String.format("\nDelta:%02f\nx1:%02f\nn2:%02f",delta,X1,X2);
        }
    }
}
