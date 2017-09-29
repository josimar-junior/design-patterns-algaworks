package com.jj.notafiscal;


public class NotaFiscalPessoaJuridica extends NotaFiscal {

	@Override
	public CalculoImposto calcularImpostoNotaFiscal() {
		// TODO Auto-generated method stub
		return new CalculoImpostoNotaFiscalPessoaJuridica();
	}

}
