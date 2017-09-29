package com.jj.dao;

import com.jj.model.Agenda;
import com.jj.model.Contato;

public class CacheAgendaDAO implements Agenda {

	private Agenda agenda;
	
	public CacheAgendaDAO(Agenda agenda) {
		this.agenda = agenda;
	}

	@Override
	public void inserir(Contato contato) {
		agenda.inserir(contato);
	}

	@Override
	public Contato buscar(int codigo) {
		return agenda.buscar(codigo);
	}

}
