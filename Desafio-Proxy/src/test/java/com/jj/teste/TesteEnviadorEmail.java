package com.jj.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jj.enviador.EnviadorEmailProxy;
import com.jj.model.EnviadorEmail;

public class TesteEnviadorEmail {

	@Test
	public void deveRetornarNomeDoEmailValido() {
		EnviadorEmail enviador = new EnviadorEmailProxy("contatos_ativos.xml", "contatos_inativos.xml");
		String nome = enviador.buscarPorEmail("joao@email.com");
		assertEquals("João Silva", nome);
	}
	
	@Test
	public void naoDeveRetornarUmNome() {
		EnviadorEmail enviador = new EnviadorEmailProxy("contatos_ativos.xml", "contatos_inativos.xml");
		String nome = enviador.buscarPorEmail("julio@email.com");
		assertEquals(null, nome);
	}
	
}
