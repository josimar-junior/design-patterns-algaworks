package com.jj.notafiscal;


public class NotaFiscalPessoaFisica extends NotaFiscal {

	@Override
	public CalculoImposto calcularImpostoNotaFiscal() {
		// TODO Auto-generated method stub
		return new CalculoImpostoNotaFiscalPessoaFisica();
	}

}
