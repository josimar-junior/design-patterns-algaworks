package com.jj.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.jj.model.Agenda;
import com.jj.model.Contato;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class AgendaDAO implements Agenda{

	private XStream stream;
	private Map<Integer, Contato> contatos;
	
	@Override
	public void inserir(Contato contato) {
		stream = new XStream(new DomDriver());
		
		List<Contato> lista = new ArrayList<Contato>();
		lista.add(contato);
		
		stream.alias("contatos", List.class);
		stream.alias("contato", Contato.class);
		try(PrintStream writer = new PrintStream(new FileOutputStream("Contatos.xml", true))) {
			stream.toXML(lista, writer);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Erro ao salvar arquivo");
		}
	}

	@Override
	public Contato buscar(int codigo) {
		inserirNoMap();
		return contatos.get(codigo);
	}
	
	@SuppressWarnings("unchecked")
	private List<Contato> getContatos() {
		stream = new XStream();
		stream.alias("contatos", List.class);
		stream.alias("contato", Contato.class);
		List<Contato> contato = (List<Contato>) stream.fromXML(getClass()
				.getResource("Contatos.xml"));
		return contato;
	}
	
	private void inserirNoMap() {
		for (Contato contato : getContatos()) {
			this.contatos.put(contato.getCodigo(), contato);
		}
	}

}
