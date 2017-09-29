package com.jj.notafiscal;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.jj.model.ItemProduto;

public abstract class NotaFiscal {

	private Integer numero;
	private Date dataEmissao;
	private List<ItemProduto> itensProdutos;

	public abstract CalculoImposto calcularImpostoNotaFiscal();

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public List<ItemProduto> getItensProdutos() {
		return itensProdutos;
	}

	public void setItensProdutos(List<ItemProduto> itensProdutos) {
		this.itensProdutos = itensProdutos;
	}

	public BigDecimal calcularValorTotal() {
		BigDecimal valorTotal = BigDecimal.ZERO;

		for (ItemProduto itens : getItensProdutos()) {
			valorTotal = valorTotal.add(itens.getValor().multiply(
					new BigDecimal(itens.getQuantidade())));
		}

		return valorTotal;
	}
	
	public final BigDecimal calcularNF() {
		return calcularImpostoNotaFiscal().calcularImposto(calcularValorTotal());
	}
}
