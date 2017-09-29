package com.jj.contatos;

import java.util.List;

import com.jj.model.Contato;
import com.jj.model.Contatos;
import com.thoughtworks.xstream.XStream;

public class ContatosXML implements Contatos {

	@SuppressWarnings("unchecked")
	public List<Contato> recuperarContatos(String arquivo) {
		XStream stream = new XStream();
		stream.alias("contatos", List.class);
		stream.alias("contato", Contato.class);
		List<Contato> emails = (List<Contato>) stream.fromXML(getClass()
				.getResource("/" + arquivo));
		return emails;
	}

}
