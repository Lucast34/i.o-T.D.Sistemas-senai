/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relacionamento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ead
 */
public class Universidade {
    String nome;
    List<Aluno> alunos = new ArrayList<>();

    public Universidade(String nome) {
        this.nome = nome;
    }
    
    void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    void listarAlunos(){
        System.out.println("Universidade: "+nome);
        
        for (Aluno a : alunos) {
            System.out.println("Aluno: "+a.nome);
            
        }
        
    }
    
}
