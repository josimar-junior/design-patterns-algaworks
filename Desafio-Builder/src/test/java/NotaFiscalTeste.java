import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.jj.builder.NotaFiscalBuilder;
import com.jj.notafiscal.NotaFiscal;

public class NotaFiscalTeste {

	@Test
	public void calcularImpostoNotaFiscalPessoaFisica() {
		NotaFiscal notaFiscalPessoaFisica = new NotaFiscalBuilder()
				.construirPessoaFisica()
				.comNotaFiscalPessoaFisica(222, "09/08/2015")
				.comProduto("Mochila", 1, "100")
				.comProduto("Calculadora", 1, "300").construir();
		
		
		BigDecimal valorNotaFiscal = notaFiscalPessoaFisica.calcularNF();
		
		assertEquals(new BigDecimal("428.00").doubleValue(), valorNotaFiscal.doubleValue(), 0.0001);
	}
	
	@Test
	public void calcularImpostoNotaFiscalPessoaJuridica() {
		NotaFiscal notaFiscalPessoaFisica = new NotaFiscalBuilder()
				.construirPessoaJuridica()
				.comNotaFiscalPessoaFisica(222, "09/08/2015")
				.comProduto("Mochila", 1, "90")
				.comProduto("Calculadora", 1, "150").construir();
		
		
		BigDecimal valorNotaFiscal = notaFiscalPessoaFisica.calcularNF();
		
		assertEquals(new BigDecimal("249.60").doubleValue(), valorNotaFiscal.doubleValue(), 0.0001);
	}
}
