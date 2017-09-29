package com.jj.boleto;

import java.math.BigDecimal;

import com.jj.model.boleto.Boleto;
import com.jj.model.produto.Produto;

public class BoletoCaixa implements Boleto{

	@Override
	public void emitirBoleto(Produto produto, BigDecimal imposto) {
		System.out.println("----------------------------------");
		System.out.println("Emissão do boleto da CAIXA");
		System.out.println("----------------------------------");
		System.out.println("Imposto: R$ " + imposto);
		System.out.println("Valor Total: R$ " + produto.getValorTotal(imposto));
		
	}

}
