/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relacionamento;

/**
 *
 * @author ead
 */
public class Relacionamento {

    public static void main(String[] args) {        
      
        Escola escola = new Escola("Senai");
        Professor pfr = new Professor("Joao kesley", escola);
        
        
        pfr.mostrarDados();
        
        Universidade univ = new Universidade("UFBA");
        
        Aluno a1 = new Aluno("Maria");
        Aluno a2 = new Aluno("Carlos");
        
        univ.adicionarAluno(a1);
        univ.adicionarAluno(a2);
        univ.listarAlunos();
        
        Corpo corpo = new Corpo();
        
        corpo.viver();
        
    }
}
