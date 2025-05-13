/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sobrecarga;

/**
 *
 * @author ead
 */
public class Sobrecarga {

    public static void main(String[] args) {
        Calculo cal = new Calculo();
        
        cal.metric(2);
        cal.metric(5,5);
        cal.metric(1,5,-14);
        cal.metric(5, 6, 3, 8);
    }

}
