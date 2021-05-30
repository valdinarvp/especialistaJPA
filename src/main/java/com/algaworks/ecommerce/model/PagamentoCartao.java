package com.algaworks.ecommerce.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DiscriminatorValue("cartao")
@Entity
@Table(name="pagamento_cartao")
public class PagamentoCartao extends Pagamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "numero_cartao")
	private String numeroCartao;
	
}
