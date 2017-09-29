package com.jj.BO;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import javax.inject.Inject;

import com.jj.model.Cadastro;
import com.jj.model.CadastroService;
import com.jj.model.Filme;

public class CadastroFilmeBO implements CadastroService{

	@Inject
	private Cadastro cadastro;
	
	@Override
	public void salvar(Filme filme) {
		LocalDate data = converterDateParaLocalDate(filme.getDataLancamento());
		int tempo = Period.between(data, LocalDate.now()).getMonths();
		String tipo = tempo > 3 ? "Antigo" : "Novo";
		
		filme.setTipo(tipo);
		cadastro.salvar(filme);
	}
	
	private LocalDate converterDateParaLocalDate(Date d) {
		Instant instant = Instant.ofEpochMilli(d.getTime());
        LocalDate localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
        return localDate;
	}

}
