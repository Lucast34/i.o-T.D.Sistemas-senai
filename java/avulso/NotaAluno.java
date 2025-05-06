package com.mycompany.lucas;

import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class NotaAluno {
    
    public static void main (String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Nome do Aluno:");
        
    String nome = input.next();
     
    System.out.println("Digite a Primeira Nota:");
    
    double n1 = input.nextDouble();
    
    System.out.println("Digite a Segunda Nota:");
    
    double n2 = input.nextDouble();
    
    double m = (n1+n2)/2;
    
    if(m > 6){
        System.out.format("%s, foi aprovado\nMédia:%.2f",nome,m);
    }else{
        System.out.format("%s, foi REPROVADO\nMédia:%.2f",nome,m);
    }
    
    }
    
}
