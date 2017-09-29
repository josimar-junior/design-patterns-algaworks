package com.jj.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import com.jj.cdi.WeldContext;
import com.jj.model.CadastroService;
import com.jj.model.Filme;

public class Main {

	public static void main(String[] args) {

		CadastroService service = WeldContext.INSTANCE.getBean(CadastroService.class);
		
		String nome = JOptionPane.showInputDialog("Digite o nome do filme!");
		String dataLancamento = JOptionPane.showInputDialog("Digite a data do lançamento!");
		
		Filme filme = new Filme();
		filme.setNome(nome);
		filme.setDataLancamento(converterStringEmDate(dataLancamento));
		
		service.salvar(filme);
	}
	
	private static Date converterStringEmDate(String data) {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date lancamento = null;
		try {
			lancamento = formatter.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return lancamento;
	}

}
