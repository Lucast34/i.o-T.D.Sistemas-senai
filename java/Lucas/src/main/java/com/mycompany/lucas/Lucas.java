/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lucas;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ead
 */
public class Lucas {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
 
        System.out.println("Programa de Impar e Par");
        
        System.out.println("digte um numero >> ");
        
        int val = input.nextInt();
                
        ImparPar resp = new ImparPar(val);           
        
        System.out.println("Programa bhaskara");

        System.out.println("Digite o valor de A >> ");
        
        double a = input.nextDouble();

        System.out.println("Digite o valor de B >> ");
        
        double b = input.nextDouble();

        System.out.println("Digite o valor de C >> ");
        double c = input.nextDouble();
            
        Bhaskara bha = new Bhaskara(a,b,c);
        
        System.out.println("Programa verificador de Triangulo");
        
        System.out.println("Digite o lado A >> ");
        
        int ladoa = input.nextInt();
        
        System.out.println("Digite o lado B >> ");
        
        int ladob = input.nextInt();
        
        System.out.println("Digite o lado C >> ");
        
        int ladoc = input.nextInt();
        
        Triangulo tr = new Triangulo(ladoa,ladob,ladoc);
        
        
        String texto1 = resp.VerificaImPar();
        
        String texto2 = bha.VerificaRaiz();
        
        String texto3 = tr.VerifcarTriangulo();
        
        String caminhoArquivo = "test.txt"; //nome do arquivo de saida
        
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo))){
            escritor.write(texto1);
            escritor.write(texto2);
            
            System.out.println("Texto salvo com sucesso em "+caminhoArquivo);             
        } catch (IOException e){
            System.out.println("Ococrreu um erro ao salvar o texto: "+e.getMessage());
        }
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))){
            String linha;
            System.out.println("Texto lido com sucesso em "+caminhoArquivo);  
            
            while ((linha = leitor.readLine()) !=null){
                
                System.out.println(linha);
            }
        
        } catch (IOException e){
            System.out.println("Ococrreu um erro ao salvar o texto: "+e.getMessage());
        }
    }
}
