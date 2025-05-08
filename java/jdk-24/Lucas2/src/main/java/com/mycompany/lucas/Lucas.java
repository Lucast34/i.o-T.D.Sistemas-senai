package com.mycompany.lucas;


import java.util.Scanner;
import java.io.IOException;
import java.time.LocalDate;
import java.io.FileWriter;



public class Lucas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quantas pessoas cadastrar? ");
        
        int qtd = input.nextInt();
        
        input.nextLine();
        
        Pessoa[] pessoas = new Pessoa[qtd];
        
        for(int i=0;i<qtd;i++){
            System.out.println("\n Cadastro de Pessoa"+(i+1)+"---");
            
            System.out.println("Nome: ");
            String nome = input.nextLine();
            
            System.out.println("CPF: ");
            String cpf = input.nextLine();
            
            System.out.println("Data Nascimento (AAAA-MM-DD): ");
            String dataStr = input.nextLine();
            
            System.out.println("Altura (em metros): ");
            double altura = input.nextDouble();
        
            System.out.println("Altura (em KG): ");
            double peso = input.nextDouble();
            
            LocalDate dataLocal = LocalDate.parse(dataStr);
            
            pessoas[i] = new Pessoa(nome,cpf,dataLocal,altura,peso);
        }
            
        String arquivo = "pessoas.txt" ;
               
        try (FileWriter write = new FileWriter(arquivo)){
            write.write("Nome;Cpf:dataNascimento;Altura.;Peso;Imc;MaiorIdade\n");
            for(Pessoa p: pessoas){
                write.write(p.toCSV()+"\n");
            }
            System.out.println("\nArquivo "+arquivo+"salvo com sucesso'");
        }catch(IOException e){
            System.out.println("Error:"+e.getMessage());
        }
        
        input.close();
        
    }  
}
