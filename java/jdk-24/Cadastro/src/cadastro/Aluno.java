/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

public class Aluno  extends Pessoa{
    private int id;
    private String matricula;
    private String curso;
    
    //cheio
    
    public Aluno(int id, String matricula, String curso, String nome, String endereco, String sexo, String cpf) {
        super(nome, endereco, sexo, cpf);
        this.id = id;
        this.matricula = matricula;
        this.curso = curso;
    }
    
    // metade
    
    public Aluno(String matricula, String curso, String nome, String endereco, String sexo, String cpf) {
        super(nome, endereco, sexo, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    // vazio

    public Aluno() {

    }
    
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
