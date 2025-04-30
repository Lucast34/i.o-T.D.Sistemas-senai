/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iot.td;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class IotTd {
    public static void main(String[] args) {
      
        Scanner input  = new  Scanner(System.in);
        
        System.out.println("1- Programa par e impar \n2- Programa Bhaskara "
                + "\n3- Programa Maior idade\n4- Encerra o Programa"); 
        
        System.out.print("Selecione um programa >>> ");
         
        int escolha = input.nextInt();
        
        switch (escolha){
        
            case 1 -> {
                System.out.println("Programa par e impar");
                
                System.out.print("Digte um numero >>>");
                int num1 = input.nextInt();
                
                // ternario
                
                String response=(num1% 2 == 0)?"O numero: "+num1+" e par":"O numero: "+num1+" e impar"; 
               
                
                JOptionPane.showMessageDialog(null,response,"Programa impar e par"
                                              ,JOptionPane.PLAIN_MESSAGE);
             
            }
            case 2 -> {
                System.out.println("Programa Bhaskara");
                double delta,xa,xb;
                
                System.out.print("Digite o valor de A >>> ");
                
                double a = input.nextDouble();
                
                System.out.print("Digite o valor de B >>> ");
                
                double b = input.nextDouble();
                
                System.out.print("Digite o valor de C >>> ");
                
                double c = input.nextDouble();
                
                delta = (Math.pow(b,2))+(-4*(a*c));
               
                
                if (delta >= 0){
                    xa = ((-(b)+ Math.sqrt(delta))/2*a);
                    xb = ((-(b)- Math.sqrt(delta))/2*a);
                    
                    String res = String.format("Delta >> %.02f\nX1 >>%.02f\nX2 "
                            + ">>%.02f ",delta,xa,xb);
                    
                    //System.out.println(res);
                    JOptionPane.showMessageDialog(null,res,"Programa Bhaskara"
                                              ,JOptionPane.PLAIN_MESSAGE);
                }else{
                    
                    String resErro =("A Raiza não existe\nValor de delta >> "+delta);
                    JOptionPane.showMessageDialog(null,resErro,"Programa Bhaskara"
                                              ,JOptionPane.ERROR_MESSAGE);
                }
            }
            case 3 -> {
                System.out.println("Programa Maior Idade");
                
                System.out.print("Digite a sua idade >> ");
                
                int id = input.nextInt();
                
                if(id > 18){
                    
                    String res1 = (id >= 18 && id <= 70)?"Pode votar."
                            + "\nObrigatorio":"Pode votar. \nNão obrigatorio";
                    
                    JOptionPane.showMessageDialog(null,res1,"Programa Maior Idade"
                                              ,JOptionPane.PLAIN_MESSAGE);
                    System.out.println(res1);
                    
                }else{
                    String res2 =("Não pode votar.\nNão atingiu a maior idade");
                    JOptionPane.showMessageDialog(null,res2,"Programa Maior Idade"
                                              ,JOptionPane.ERROR_MESSAGE);
                }
            }
            case 4 -> System.out.print("Programa encerrado");
            default -> throw new AssertionError(escolha);
        }
        
        
        
    }
}