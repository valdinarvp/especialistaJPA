package com.algaworks.ecommerce.jpql;

import java.util.List;

import javax.persistence.TypedQuery;

import org.junit.Assert;
import org.junit.Test;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.model.Pedido;

public class JoinTest extends EntityManagerTest {
	
	@Test
    public void usarJoinFetch() {
       
		String jpql = "select p from Pedido p "
                 + " left join fetch p.pagamento "
                 + " join fetch p.cliente "
                 + " left join fetch p.notaFiscal ";
		
		//String jpql = "select p from Pedido p join fetch p.pagamento join fetch p.cliente where p.id = 2";

        TypedQuery<Pedido> typedQuery = entityManager.createQuery(jpql, Pedido.class);

       /* Pedido pedido = typedQuery.getSingleResult();
        Assert.assertFalse(pedido.getItens().isEmpty());*/
        
        List<Pedido> lista = typedQuery.getResultList();
        Assert.assertFalse(lista.isEmpty());
    }
	
	@Test
    public void fazeLeftrJoin() {
		
		String jpql = "select p from Pedido p left join p.pagamento pag on pag.status = 'AGUARDANDO'";
        
		TypedQuery<Object[]> typedQuery = entityManager.createQuery(jpql, Object[].class);

        List<Object[]> lista = typedQuery.getResultList();
        Assert.assertTrue(lista.size()== 2);
       
	}
	
	@Test
    public void fazerJoin() {
		
        String jpql = "select p from Pedido p join p.pagamento pag";
        
        TypedQuery<Object[]> typedQuery = entityManager.createQuery(jpql, Object[].class);

        List<Object[]> lista = typedQuery.getResultList();
        
        Assert.assertTrue(lista.size() == 1);
        
	}
	
}
