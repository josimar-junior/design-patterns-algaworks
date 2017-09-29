package com.jj.venda;

import java.util.Properties;

import com.jj.exception.GerarBoletoException;
import com.jj.exception.GerarNotaFiscalException;
import com.jj.model.boleto.Boleto;
import com.jj.model.nota.NotaFiscal;
import com.jj.model.venda.ModuloVendaFactory;

public class LojaFactory implements ModuloVendaFactory {

	Properties properties = new Properties();

	@Override
	public NotaFiscal criarNotaFiscal() throws GerarNotaFiscalException {

		NotaFiscal nf = null;

		try {
			properties.load(getClass()
					.getResourceAsStream("/config.properties"));
			nf = (NotaFiscal) Class.forName(properties.getProperty("nfe"))
					.newInstance();
		} catch (Exception e) {
			throw new GerarNotaFiscalException(
					"Erro ao gerar Nota Fiscal \n ERRO: " + e.getMessage());
		}

		return nf;
	}

	@Override
	public Boleto criarBoleto() throws GerarBoletoException {

		Boleto boleto = null;

		try {
			properties.load(getClass()
					.getResourceAsStream("/config.properties"));
			boleto = (Boleto) Class.forName(properties.getProperty("boleto"))
					.newInstance();
		} catch (Exception e) {
			throw new GerarBoletoException("Erro ao gerar Boleto \n ERRO: "
					+ e.getMessage());
		}

		return boleto;
	}

}
