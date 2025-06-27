package com.example.test;

import org.apache.catalina.users.DataSourceUserDatabase;
import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private String senha;
	
	public User(){
		super();
	}
	
	public User(Long id, String nome, String email, String telefone, String senha) {
		this.id = id;
		this.nome = nome;
		this.email= email;
		this.telefone = telefone;
		this.senha = senha;
	}
}
