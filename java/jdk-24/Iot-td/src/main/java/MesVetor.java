/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
/**
 *
 * @author ead
 */
public class MesVetor {
    public static void main(String [] args){
        String mes[] ={"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out"
        ,"Nov","Dez"};
        
        int tot[]={31,28,31,30,31,30,31,31,30,31,30,31};
        
        for (int i=0; i<mes.length; i++){
            System.out.println("-----------------------------------");
            System.out.format("O mês: %s , tem %d dias\n",mes[i],tot[i]);
        }
    }
}
