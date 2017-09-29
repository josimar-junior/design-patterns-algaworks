package com.jj.model.venda;

import com.jj.exception.GerarBoletoException;
import com.jj.exception.GerarNotaFiscalException;
import com.jj.model.boleto.Boleto;
import com.jj.model.nota.NotaFiscal;

public interface ModuloVendaFactory {

	NotaFiscal criarNotaFiscal() throws GerarNotaFiscalException;

	Boleto criarBoleto() throws GerarBoletoException;
}
