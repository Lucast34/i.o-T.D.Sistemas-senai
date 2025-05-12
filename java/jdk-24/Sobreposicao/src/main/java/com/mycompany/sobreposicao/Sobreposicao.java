/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sobreposicao;

/**
 *
 * @author ead
 */
public class Sobreposicao {

    public static void main(String[] args) {
        Calculo conta = new Calculo();
        
        int a = conta.metric(2,5);
        double b = conta.metric(1,-1,12);
        float c = conta.metric(8f,4f,6f,2f);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        
    }
}
