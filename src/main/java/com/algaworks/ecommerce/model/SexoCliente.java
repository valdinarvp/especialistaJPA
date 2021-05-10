package com.algaworks.ecommerce.model;

public enum SexoCliente {
	
	MASCULINO("Masculino"),
	FEMININO("Feminino");
	
	private String descricao;
	
	SexoCliente(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
