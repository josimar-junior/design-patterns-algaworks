package com.jj.calculadoraimposto;

import com.jj.gerarlog.GerarLogs;

public class CalculadoraDeImposto {

	private GerarLogs gerarLogs;
	
	public CalculadoraDeImposto(GerarLogs gerarLogs) {
		this.gerarLogs = gerarLogs;
	}

	public void calcular(double valor) {
		gerarLogs.gerarLog("O imposto calculado para o valor: R$" + valor + " é de R$" + (valor * 15.5/100));
	}
}
