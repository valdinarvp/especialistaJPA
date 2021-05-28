package com.algaworks.ecommerce.model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Embeddable
public class Atributo {
	
	private String nome;
	
	private String valor;

}
