package com.algaworks.ecommerce;

import java.util.Arrays;

import org.junit.Test;

import com.algaworks.ecommerce.model.Produto;

import org.junit.Assert;
public class ElementCollectionTest extends EntityManagerTest{
	
	@Test
	public void aplicarTags() {
		
		entityManager.getTransaction().begin();
		
		Produto produto = entityManager.find(Produto.class, 1);
		produto.setTags(Arrays.asList("ebook", "livro_digital"));
		
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		
		Produto produtoVerificacao = entityManager.find(Produto.class, produto.getId());
		
		Assert.assertFalse(produtoVerificacao.getTags().isEmpty());
		
		
	}

}
