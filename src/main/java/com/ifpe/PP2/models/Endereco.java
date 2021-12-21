package com.ifpe.PP2.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Endereco {
	
	@Enumerated(EnumType.STRING)
	private UF uf;
	
	@Column(name = "EStado",length = 50)
	private String cidade;
	
	@Column(name = "Bairro")
	private String bairro;
	
	@Column(length = 15)
	private String cep;
	
	private String complemento;
	private String casa;

}
