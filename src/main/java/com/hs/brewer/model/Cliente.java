package com.hs.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class Cliente {
	
	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	
	@NotBlank(message = "CPF/CNPJ é obrigatório")
	private String cpf_cnpj;
	
	@NotBlank(message = "Email é obrigatório")
	private String email;
	
	@NotBlank(message = "Telefone é obrigatório")
	private String telefone;
	
	@NotBlank(message = "Número é obrigatório")
	private String numero;
	
	@NotBlank(message = "Logradouro é obrigatório")
	private String logradouro;
	
	@NotBlank(message = "Complemento é obrigatório")
	private String complemento;
	
	@NotBlank(message = "Estado é obrigatório")
	private String cep;
	
	@NotBlank(message = "Cidade é obrigatória")
	private String cidade;
	
	@NotBlank(message = "Tipo é obrigatório")
	private String tipo;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}
	