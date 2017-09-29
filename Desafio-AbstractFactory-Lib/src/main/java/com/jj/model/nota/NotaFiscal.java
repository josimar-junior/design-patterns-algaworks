package com.jj.model.nota;

import java.math.BigDecimal;

import com.jj.model.produto.Produto;

public interface NotaFiscal {

	void emitirNotaFiscal(Produto produto, BigDecimal imposto);
	
	BigDecimal calcularImposto(Produto produto);
	
}
