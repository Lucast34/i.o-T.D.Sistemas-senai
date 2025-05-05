/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lucas;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author ead
 */
public class Lucas {
    public static void main(String[] args) {
        String texto = "Lucas";
        String caminhoArquivo = "test.txt"; //nome do arquivo de saida
        
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo))){
            escritor.write(texto);
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
