/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author ead
 */
public class Aluno extends Pessoa{
    private String curso,matr;
    
    
    public void cancelarMatr(){
        setMatr(null);
        setCurso(null);
    }

    @Override
    public void fazerAniv() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    
    public Aluno(String curso, String matr, String nome, int idade, char sexo) {
        super(nome, idade, sexo);
        this.curso = curso;
        this.matr = matr;
    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString()+"Matricula{" + "curso=" + curso + ", matr=" + matr + '}';
    }
    
    
    
}
