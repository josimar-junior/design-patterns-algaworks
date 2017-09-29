package com.jj.model;

import java.io.Serializable;
import java.util.Date;

public class Filme implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private Date dataLancamento;
	private String tipo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
