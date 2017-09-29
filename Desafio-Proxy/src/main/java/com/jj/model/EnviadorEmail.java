package com.jj.model;

public interface EnviadorEmail {

	void enviar(String mensagem);

	String buscarPorEmail(String email);
}
