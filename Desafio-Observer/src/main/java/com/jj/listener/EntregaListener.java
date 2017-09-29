package com.jj.listener;

import java.util.List;

import com.jj.model.Pedido;
import com.jj.notificador.Notificador;

public class EntregaListener implements Listener {

	private Notificador notificador;

	public EntregaListener(Notificador notificador) {
		this.notificador = notificador;
		this.notificador.registrarListener(this);
	}

	@Override
	public void atualizar() {
		List<Pedido> novosPedidos = notificador.getNovosPedidos();

		for (Pedido pedido : novosPedidos) {
			System.out.println("Produto: " + pedido.getDescricao() + " | Valor: R$ " + pedido.getValor());
		}
	}

}
