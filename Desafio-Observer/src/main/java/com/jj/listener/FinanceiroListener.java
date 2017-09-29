package com.jj.listener;

import java.math.BigDecimal;
import java.util.List;

import com.jj.model.Pedido;
import com.jj.notificador.Notificador;

public class FinanceiroListener implements Listener{

	private Notificador notificador;
	
	public FinanceiroListener(Notificador notificador) {
		this.notificador = notificador;
		this.notificador.registrarListener(this);
	}
	
	@Override
	public void atualizar() {
		List<Pedido> novosPedidos = notificador.getNovosPedidos();
		System.out.println("Novo pedido tem um valor total de: R$ " + getValorTotal(novosPedidos));
	}
	
	private BigDecimal getValorTotal(List<Pedido> pedidos) {
		BigDecimal valorTotal = BigDecimal.ZERO;
		
		for (Pedido pedido : pedidos) {
			valorTotal = valorTotal.add(pedido.getValor());
		}
		
		return valorTotal;
	}

}
