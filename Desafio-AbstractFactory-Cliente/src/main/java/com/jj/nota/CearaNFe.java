package com.jj.nota;

import java.math.BigDecimal;

import com.jj.model.nota.NotaFiscal;
import com.jj.model.produto.Produto;

public class CearaNFe implements NotaFiscal {

	private BigDecimal aliquota = new BigDecimal("0.45");
	
	@Override
	public void emitirNotaFiscal(Produto produto, BigDecimal imposto) {
		System.out.println("Nota Fiscal Eletrônica do Ceará");
		System.out.println("-------------------------------------");
		System.out.println("Alíquota: " + (aliquota.doubleValue() * 100) + "%");
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor Unitário: R$ " + produto.getValorUnitario());
		System.out.println("Imposto: " + imposto);
		System.out.println("Valor Total: R$ " + produto.getValorTotal(imposto));
		
	}

	@Override
	public BigDecimal calcularImposto(Produto produto) {
		return aliquota.multiply(produto.getValorUnitario());
	}

}
