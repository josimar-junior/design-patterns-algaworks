package com.jj.model.venda;

import java.math.BigDecimal;

import com.jj.exception.GerarBoletoException;
import com.jj.exception.GerarNotaFiscalException;
import com.jj.model.boleto.Boleto;
import com.jj.model.nota.NotaFiscal;
import com.jj.model.produto.Produto;

public class Venda {

	private NotaFiscal notaFiscal;
	private Boleto boleto;
	
	public Venda(ModuloVendaFactory moduloVendaFactory) throws GerarNotaFiscalException, GerarBoletoException {
		notaFiscal = moduloVendaFactory.criarNotaFiscal();
		boleto = moduloVendaFactory.criarBoleto();
	}
	
	public void realizarVenda(Produto produto) {
		BigDecimal imposto = notaFiscal.calcularImposto(produto);
		notaFiscal.emitirNotaFiscal(produto, imposto);
		boleto.emitirBoleto(produto, imposto);
	}
	
	public BigDecimal getValorTotalImposto(Produto produto) {
		
		return notaFiscal.calcularImposto(produto);
	}
	
}
