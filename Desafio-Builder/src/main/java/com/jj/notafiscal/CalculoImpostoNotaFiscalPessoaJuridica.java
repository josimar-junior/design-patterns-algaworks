package com.jj.notafiscal;

import java.math.BigDecimal;

public class CalculoImpostoNotaFiscalPessoaJuridica implements CalculoImposto {

	private BigDecimal porcentagem = new BigDecimal(1.04);

	@Override
	public BigDecimal calcularImposto(BigDecimal valor) {
		return valor.multiply(porcentagem);
	}

}
