/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaswing;

public class Usuario {
    
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String tipoUsuario;
    
    //cheio
    public Usuario(int id, String nome, String email, String telefone, String tipoUsuario) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
    }
    
    //metade 
    public Usuario(String nome, String email, String telefone, String tipoUsuario) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    
    
}
