package com.jj.DAO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.jj.model.Cadastro;
import com.jj.model.Filme;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;

public class XMLCadastroFilme implements Cadastro {

	@Override
	public void salvar(Filme filme) {
		XStream stream = new XStream();

		String formato = "dd/MM/yyyy";
		String[] formatos = { formato };

		stream.registerConverter(new DateConverter(formato, formatos));

		stream.alias("filmes", Filme.class);

		OutputStream out;

		try {
			out = new FileOutputStream(filme.getNome().concat(".xml"));
			stream.toXML(filme, out);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Erro: " + e.getMessage());
		}
	}

}
