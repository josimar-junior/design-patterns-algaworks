package com.jj.main;

import com.jj.leitor.LerArquivoXML;
import com.jj.listener.EntregaListener;
import com.jj.listener.FinanceiroListener;
import com.jj.listener.Listener;
import com.jj.notificador.Notificador;
import com.jj.notificador.NotificadorFinanceiro;

public class Main {

	public static void main(String[] args) {
		
		Notificador notificador = new NotificadorFinanceiro();
		
		Listener listener1 = new EntregaListener(notificador);
		Listener listener2 = new FinanceiroListener(notificador);
		
		LerArquivoXML lerArquivoXML = new LerArquivoXML();
		
		notificador.removerListener(listener1);
		notificador.setNovosPedidos(lerArquivoXML.getPedidos());
		
	}

}
