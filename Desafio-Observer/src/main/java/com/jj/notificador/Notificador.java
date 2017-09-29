package com.jj.notificador;

import java.util.List;

import com.jj.listener.Listener;
import com.jj.model.Pedido;

public interface Notificador {

	void registrarListener(Listener listener);
	void removerListener(Listener listener);
	
	void notificarListeners();
	List<Pedido> getNovosPedidos();
	void setNovosPedidos(List<Pedido> pedidos);
}
