/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lucas1;


import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lucas1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Programa Par ou impar");
        
        System.out.print("Digite o numero >> ");
        
        int imPar = input.nextInt();
        
        ImparPar o = new ImparPar(imPar);
        
        System.out.println("Programa Bhaskara");
        
        System.out.print("Digite o valor de A >> ");
        
        double a = input.nextDouble();
        
        System.out.print("Digite o valor de B >> ");
        
        double b = input.nextDouble();
        
        System.out.print("Digite o valor de C >> ");
        
        double c = input.nextDouble();
        
        BhaskaraPoo bh = new BhaskaraPoo(a, b, c);
        
        System.out.println("Programa Triangulo");
        
        System.out.print("Digite o valor de A >> ");
        
        int ladoa = input.nextInt();
        
        System.out.print("Digite o valor de B >> ");
        
        int ladob = input.nextInt();
        
        System.out.print("Digite o valor de C >> ");
        
        int ladoc = input.nextInt();
        
        Triangulo tr = new Triangulo(ladoa, ladob, ladoc);
        
        
        String texto = o.ParImpar();
        
        String textoBh = bh.Raiz();
        
        String textoTr = tr.verificarTriangulo();
        
        String caminhoArquivo = "test.txt";
        
        try(BufferedWriter writeF = new BufferedWriter(new FileWriter(caminhoArquivo))){
            
            writeF.write(texto);
            writeF.write(textoBh);
            writeF.write(textoTr);
            
            System.out.println("Texto salvo com sucesso em "+caminhoArquivo);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar o texto: "+e.getMessage());
        }
        try(BufferedReader readF = new BufferedReader(new FileReader(caminhoArquivo))){
            String linha;
            System.out.println("Texto lido com sucesso em "+caminhoArquivo);
            
            while((linha = readF.readLine()) != null){
                System.out.println(linha);
            }
                
        }catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o texto: "+e.getMessage());
        }
    }
}
