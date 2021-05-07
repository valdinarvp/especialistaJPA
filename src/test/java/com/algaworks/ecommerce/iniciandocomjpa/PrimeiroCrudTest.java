package com.algaworks.ecommerce.iniciandocomjpa;

import org.junit.Assert;
import org.junit.Test;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.model.Cliente;

public class PrimeiroCrudTest extends EntityManagerTest{

	@Test
	public void inserirComMerge() {
		
		Cliente cliente = new Cliente();
		
		cliente.setId(4);
		cliente.setNome("Valdinar Pereira");
		
		entityManager.getTransaction().begin();
		entityManager.merge(cliente);
		entityManager.getTransaction().commit();
		
		Cliente clienteVerificacao = entityManager.find(Cliente.class, cliente.getId());
		Assert.assertNotNull(clienteVerificacao);
		
		
	}
	
	@Test
	public void atualizarObjetoGerenciado() {
		
		Cliente cliente = entityManager.find(Cliente.class, 3);
		
		entityManager.getTransaction().begin();
		cliente.setNome("Karla P. Pereira");
		entityManager.getTransaction().commit();
		
		Cliente clienteVerificacao = entityManager.find(Cliente.class, cliente.getId());
		Assert.assertEquals("Karla P. Pereira", clienteVerificacao.getNome());
	}
	
	@Test
	public void atualizarObjeto() {
		
		Cliente cliente = new Cliente();
		
		cliente.setId(3);
		cliente.setNome("Tânia Karla Pereira");
		
		entityManager.getTransaction().begin();
		entityManager.merge(cliente);
		entityManager.getTransaction().commit();
		
		Cliente clienteVerificacao = entityManager.find(Cliente.class, 3);
		Assert.assertNotNull(clienteVerificacao);
		
		Assert.assertEquals("Tânia Karla Pereira", clienteVerificacao.getNome());

	}
	
	@Test
	public void removerObjeto() {
		
		Cliente cliente = entityManager.find(Cliente.class, 3);
		
		entityManager.getTransaction().begin();
		entityManager.remove(cliente);
		entityManager.getTransaction().commit();
		
		Cliente clienteVerificaca = entityManager.find(Cliente.class, 3);
		Assert.assertNull(clienteVerificaca);
	}
	
	@Test
	public void inserirPrimeiroObjeto() {
		
		Cliente cliente = new Cliente();
		
		cliente.setId(4);
		cliente.setNome("Valdinar Pereira");
		
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
		
		Cliente clienteVerificacao = entityManager.find(Cliente.class, cliente.getId());
		Assert.assertNotNull(clienteVerificacao);		
	}

}
