package com.algaworks.ecommerce.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "categoria")
public class Categoria extends EntitydadeBaseInteger  implements Serializable{

	private static final long serialVersionUID = 1L;

	private String nome;
	
	@ManyToOne
	@JoinColumn(name="categoria_pai_id")
	private Categoria categoriaPai;
	
	@OneToMany(mappedBy="categoriaPai")
	private List<Categoria> categorias;
	
	@ManyToMany(mappedBy = "categorias")
	private List<Produto> produtos;
}
