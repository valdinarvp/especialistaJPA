package com.algaworks.ecommerce.model;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name = "item_pedido")
public class ItemPedido implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	@Id
	private Integer id;
	
	@Column(name="pedido_id")
	private Integer pedidoId; 
	
	@Column(name="produto_id")
	private Integer produtoId;
	
	@Column(name="preco_produto")
	private BigDecimal precoProduto;
	
	private Integer quantidade;
	

}
