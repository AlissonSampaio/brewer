package com.hs.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class Cidade {
	
	@NotBlank(message = "Estado é obrigatório")
	private String estado;
	
	@NotBlank(message = "Nome é obrigatório")
	private String nome;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	


	
}
	