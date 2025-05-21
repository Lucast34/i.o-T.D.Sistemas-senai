/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaswing;

import javax.swing.*;
        
public class JavaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame janela = new JFrame("Minha Primeira Janela");
        
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        janela.setLayout(null);
        
        JButton botao = new JButton("Clique aqui");
        
        botao.setBounds(80, 70, 130, 30);
        
        botao.addActionListener( e ->{
            JOptionPane.showMessageDialog(null, "Olá, mundo Swing?");
        
        } );
        
        janela.add(botao);
        
        janela.setVisible(true);
    }
    
}
