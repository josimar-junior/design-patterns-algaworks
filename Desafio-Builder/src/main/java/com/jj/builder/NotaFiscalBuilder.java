package com.jj.builder;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.jj.model.ItemProduto;
import com.jj.notafiscal.NotaFiscal;
import com.jj.notafiscal.NotaFiscalPessoaFisica;
import com.jj.notafiscal.NotaFiscalPessoaJuridica;

public class NotaFiscalBuilder {

	private NotaFiscal notaFiscal;

	public NotaFiscalBuilder construirPessoaFisica() {
		notaFiscal = new NotaFiscalPessoaFisica();
		return this;
	}

	public NotaFiscalBuilder construirPessoaJuridica() {
		notaFiscal = new NotaFiscalPessoaJuridica();
		return this;
	}
	
	public NotaFiscal construir() {
		return notaFiscal;
	}

	public NotaFiscalBuilder comNotaFiscalPessoaFisica(Integer numero,
			String dataEmissao) {

		notaFiscal.setNumero(numero);
		notaFiscal.setDataEmissao(getData(dataEmissao));

		return this;
	}
	
	public NotaFiscalBuilder comNotaFiscalPessoaJuridica(Integer numero,
			String dataEmissao) {

		notaFiscal.setNumero(numero);
		notaFiscal.setDataEmissao(getData(dataEmissao));

		return this;
	}
	
	public NotaFiscalBuilder comProduto(String nome, Integer quantidade, String valor) {
		ItemProduto itemProduto = new ItemProduto();
		
		itemProduto.setNome(nome);
		itemProduto.setQuantidade(quantidade);
		itemProduto.setValor(new BigDecimal(valor));
		
		if(notaFiscal.getItensProdutos() == null) {
			notaFiscal.setItensProdutos(new ArrayList<ItemProduto>());
		}
		
		notaFiscal.getItensProdutos().add(itemProduto);
		return this;
	}

	private Date getData(String data) {
		Date dataFormatada = null;

		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		try {
			dataFormatada = format.parse(data);
		} catch (ParseException e) {
			System.out.println("Data inválida. Erro: " + e.getMessage());
		}

		return dataFormatada;
	}
}
