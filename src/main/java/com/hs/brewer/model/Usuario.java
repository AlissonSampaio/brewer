package com.hs.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class Usuario {
	
	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	
	@NotBlank(message = "Email é obrigatório")
	private String email;
	
	@NotBlank(message = "Data de nascimento é obrigatória")
	private String dataNascimento;
	
	@NotBlank(message = "Senha é obrigatória")
	private String senha;
	
	@NotBlank(message = "Confirmar a senha é obrigatório")
	private String confirmacaoSenha;
	
	
	private String status;


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


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getConfirmacaoSenha() {
		return confirmacaoSenha;
	}


	public void setConfirmacaoSenha(String confirmacaoSenha) {
		this.confirmacaoSenha = confirmacaoSenha;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
		
}
	