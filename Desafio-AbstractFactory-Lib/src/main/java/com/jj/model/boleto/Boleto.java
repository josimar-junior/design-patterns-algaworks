package com.jj.model.boleto;

import java.math.BigDecimal;

import com.jj.model.produto.Produto;

public interface Boleto {

	void emitirBoleto(Produto produto, BigDecimal imposto);
}
