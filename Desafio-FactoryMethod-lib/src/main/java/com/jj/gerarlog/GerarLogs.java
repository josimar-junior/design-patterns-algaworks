package com.jj.gerarlog;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public abstract class GerarLogs {

	protected abstract ImprimirLog imprimirLog();

	public void gerarLog(String mensagem) {
		imprimirLog().log(dataEHoraFormatada() + " - " + mensagem);
	}

	private String dataEHoraFormatada() {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofLocalizedDateTime(
				FormatStyle.SHORT).withLocale(new Locale("pt", "br"));
		return date.format(formatador);
	}
}
