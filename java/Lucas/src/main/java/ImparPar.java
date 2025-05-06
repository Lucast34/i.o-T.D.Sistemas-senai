/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ead
 */
public class ImparPar {
    public int a;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    public String VerificaImPar(){
    
        String response = (a %2 == 0)?"O numero"+a+"é par":"O numero"+a+"é impar";
        
        return response;
    }
    
}
