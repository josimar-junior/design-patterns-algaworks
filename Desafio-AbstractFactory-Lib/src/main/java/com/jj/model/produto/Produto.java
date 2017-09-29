package com.jj.model.produto;

import java.math.BigDecimal;

public class Produto {

	private String nome;
	private Integer quantidade;
	private BigDecimal valorUnitario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public BigDecimal getValorTotal(BigDecimal imposto) {

		BigDecimal valorTotal = valorUnitario.add(new BigDecimal(imposto.doubleValue()));
		valorTotal = valorTotal.multiply(new BigDecimal(quantidade));

		return valorTotal;
	}

}
