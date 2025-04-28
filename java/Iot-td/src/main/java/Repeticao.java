/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ead
 */
public class Repeticao {
    public static void main(String[] args){
        int linha = 5;
        
        for(int i = 1; i <= linha;i++){
            for(int j = 1; j<= linha-i;j++){
                System.out.print(" ");
            }
            
            for(int k = 1; k <= i; k++){
                System.out.print("#");
            }
            System.out.print("|");
            
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            
            System.out.println();
            //for (int)
            
        } 
        
                
         
        
    }
}
//aster <- "*"

//para i de 1 ate 5 faca
//   para j de 1 ate i faca
//   escreva("*")
//   fimpara
//escreval("")
//fimpara




/*
        while (cont <= 10){
        
            cont = cont+1;
            
            if(cont == 2 || cont == 7){
            
                continue;
            }
            
            if(cont == 8){
            
                break;
                
            }
            System.out.println(cont);
        
        }
    
    }
  int cont = 0;
        
        do{
            
            System.out.println(cont);
            
            cont ++;
        }while (cont<= 5);

 */


