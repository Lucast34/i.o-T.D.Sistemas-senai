package com.mycompany.lucas;

import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class Lucas {

    public static void main(String[] args) {
        
        double a,b,c,delta,xa,xb;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor de A >>> ");
        
        a = input.nextDouble();
        
        System.out.print("Digite o valor de B >>> ");
        
        b = input.nextDouble();
        
        System.out.print("Digite o valor de C >>> ");
        
        c = input.nextDouble();
        
        delta = (Math.pow(b,2))+(-4*(a*c));
        
        if (delta >= 0){
            xa = ((-(b) + Math.sqrt(delta))/2*a);
            xb = ((-(b) - Math.sqrt(delta))/2*a);
            
            PrintStream format = System.out.format("O valor de X1 e: %.02\nX2: %.02\ndelta: %.02", xa,xb,delta);

            
        }else{
            System.out.print("A raiz não esxite. O valor foi:"+ delta);
           
        }
        
               
             
    }
}
