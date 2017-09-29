package com.jj.leitor;

import java.util.List;

import com.jj.model.Pedido;
import com.thoughtworks.xstream.XStream;

public class LerArquivoXML {

	@SuppressWarnings("unchecked")
	public List<Pedido> getPedidos() {
		XStream stream = new XStream();
		stream.alias("pedidos", List.class);
		stream.alias("pedido", Pedido.class);
		List<Pedido> pedidos = (List<Pedido>) stream.fromXML(getClass()
				.getResource("/pedidos.xml"));
		return pedidos;
	}
}
