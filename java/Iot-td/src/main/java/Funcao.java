

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ead
 */
public class Funcao {
    static String soma(double a, double b ,double c){
        double delta = (Math.pow(b,2))+(-4*(a*c));
        
        if(delta > 0){
            
            double xa = ((-(b) + Math.sqrt(delta))/2*a);
            double xb = ((-(b) - Math.sqrt(delta))/2*a);
            
            return String.format("O valor de delta:%.0f\nO valor de x1:%.0f"
                    + "\nO valor de x2:%.01f",delta,xa,xb);
            
           
        }else{
            return String.format("A raiz não existe!\nValor de delta:%f",delta);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
                       
        System.out.print("Digite o valor de A >> ");
        
        double x = input.nextDouble();
        
        System.out.print("Digite o valor de B >> ");
        
        double z = input.nextDouble();
        
        System.out.print("Digite o valor de C >> ");
        
        double y = input.nextDouble();
        
        soma(x,z,y);
  
    }
}
