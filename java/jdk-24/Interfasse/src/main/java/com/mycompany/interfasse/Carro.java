package com.mycompany.interfasse;

class Carro implements Transporte{

    @Override
    public void mover() {
        System.out.println("Carro está na estrada");
    }
    
}
