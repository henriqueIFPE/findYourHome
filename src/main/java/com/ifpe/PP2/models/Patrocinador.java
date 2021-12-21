package com.ifpe.PP2.models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Patrocinador extends Pessoa{
	
	private String cnpj;
	
	@Column(name = "razao_social")
	private String nome;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	
}
