package com.algaworks.ecommerce.mapeamentobasico;

import org.junit.Assert;
import org.junit.Test;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.model.Cliente;

public class MapeamentoEnumeracoesTest extends EntityManagerTest{
	
	@Test
	public void testarEnum() {
		Cliente cliente = new Cliente();
		
		cliente.setId(4);
		cliente.setNome("Valdinar Pereira");
		//cliente.setSexo(SexoCliente.MASCULINO);
		cliente.setSexo("Masculino");	
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		
		Cliente clienteVerificacao = entityManager.find(Cliente.class, cliente.getId());
		
		Assert.assertNotNull(clienteVerificacao);
	}

}