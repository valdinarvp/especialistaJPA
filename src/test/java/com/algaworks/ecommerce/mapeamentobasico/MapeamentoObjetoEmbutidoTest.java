package com.algaworks.ecommerce.mapeamentobasico;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.model.EnderecoEntregaPedido;
import com.algaworks.ecommerce.model.Pedido;

public class MapeamentoObjetoEmbutidoTest extends EntityManagerTest{
	
	@Test
	public void analisarMapeamentoObjetoEmbutido(){
		
		EnderecoEntregaPedido endereco = new  EnderecoEntregaPedido();
		
		endereco.setCep("36200-496");
		endereco.setLogradouro("Rua Brigadeiro Eduardo Gomes");
		endereco.setBairro("Campo");
		endereco.setCidade("Barbabacena");
		endereco.setNumero("16");
		endereco.setComplemento("Próximo ao CASSAB");
		
		Pedido pedido = new Pedido();
		pedido.setId(1);
		pedido.setDataConclusao(LocalDateTime.now());
		pedido.setTotal(new BigDecimal(1000));
		pedido.setEnderecoEntrega(endereco);
		
		entityManager.getTransaction().begin();
		entityManager.persist(pedido);
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		
		Pedido pedidoVerificacao = entityManager.find(Pedido.class, pedido.getId());
		Assert.assertNotNull(pedidoVerificacao);
		Assert.assertNotNull(pedidoVerificacao.getEnderecoEntrega());
		Assert.assertNotNull(pedidoVerificacao.getEnderecoEntrega().getCep());
		
		
	}

}
