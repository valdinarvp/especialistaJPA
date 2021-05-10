package com.algaworks.ecommerce.model;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "estoque")
public class NotaFiscal implements Serializable {

	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@Id
	private Integer id;
	
	@Column(name="pedido_id")
	private Integer pedidoId;
	
	private String xml;
	
	@Column(name="data_emissao")
	private Date dataEmissao;

}
