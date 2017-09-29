package com.jj.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	private String descricao;
	private BigDecimal valor;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
