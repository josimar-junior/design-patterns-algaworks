package com.jj.notafiscal;

import java.math.BigDecimal;

public class CalculoImpostoNotaFiscalPessoaFisica implements CalculoImposto {

	private BigDecimal porcentagem = new BigDecimal(1.07);

	@Override
	public BigDecimal calcularImposto(BigDecimal valor) {
		return valor.multiply(porcentagem);
	}

}
