package com.jj.main;

import com.jj.calculadoraimposto.CalculadoraDeImposto;
import com.jj.gerarlog.GerarLogs;
import com.jj.logtxt.GerarLogTXT;

public class TesteCalculoImposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GerarLogs gerar = new GerarLogTXT();
		CalculadoraDeImposto ci = new CalculadoraDeImposto(gerar);
		ci.calcular(300);
		
	}

}
