package com.algaworks.ecommerce.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
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
	//@GeneratedValue(strategy = GenerationType.IDENTITY) 
	//Trabalhando com chave composta, primária e estrangeira
	@Column(name="pedido_id")
	private Integer id;
	
	@MapsId
	@OneToOne(optional = false)
	@JoinColumn(name="pedido_id",nullable = false, foreignKey = @ForeignKey(name = "fk_nota_fiscal_pedido"))
	//@JoinColumn(name="pedido_id", insertable = false, updatable = false)
	private Pedido pedido;
	
	@Lob
	@Column(nullable = false)
	private byte[] xml;
	
	@Column(name="data_emissao", nullable = false)
	private Date dataEmissao;

}
