package com.algaworks.ecommerce.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="pagamento_cartao")
public class PagamentoCartao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	@Id
	private Integer id;
	
	@Column(name = "pedido_id")
	private Integer pedidoId;
	
	private StatusPagamento status;
	
	private String numero;
	
}
