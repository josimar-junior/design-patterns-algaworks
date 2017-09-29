package com.jj.notificador;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.jj.listener.Listener;
import com.jj.model.Pedido;

public class NotificadorFinanceiro implements Notificador{

	private Set<Listener> listeners;
	private List<Pedido> pedidos;
	
	public NotificadorFinanceiro() {
		listeners = new HashSet<>();
	}
	
	@Override
	public void registrarListener(Listener listener) {
		listeners.add(listener);
	}

	@Override
	public void removerListener(Listener listener) {
		listeners.remove(listener);
		
	}

	@Override
	public void notificarListeners() {
		for(Listener listener : listeners) {
			listener.atualizar();
		}
		
	}

	@Override
	public List<Pedido> getNovosPedidos() {
		return pedidos;
	}

	@Override
	public void setNovosPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
		notificarListeners();
	}

}
