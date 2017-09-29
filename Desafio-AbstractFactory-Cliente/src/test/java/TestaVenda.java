import java.math.BigDecimal;

import org.junit.Test;
import static org.junit.Assert.*;

import com.jj.exception.GerarBoletoException;
import com.jj.exception.GerarNotaFiscalException;
import com.jj.model.produto.Produto;
import com.jj.model.venda.ModuloVendaFactory;
import com.jj.model.venda.Venda;
import com.jj.venda.LojaFactory;


public class TestaVenda {
	
	@Test
	public void calcularImpostoTotalDaVenda() {
		Produto produto = new Produto();
		Venda venda = realizarVenda(produto);
		
		assertEquals(new BigDecimal("45.0").doubleValue(), venda.getValorTotalImposto(produto).doubleValue(), 0.0001);
	}
	
	public Venda realizarVenda(Produto produto) {
		produto.setNome("Mochila");
		produto.setQuantidade(1);
		produto.setValorUnitario(new BigDecimal("100"));
		
		ModuloVendaFactory moduloVendaFactory = new LojaFactory();
		Venda venda = null;
		try {
			venda = new Venda(moduloVendaFactory);
			venda.realizarVenda(produto);
		} catch (GerarNotaFiscalException e) {
			System.out.println("Erro ao gerar Nota Fiscal \n ERRO: " + e.getMessage());
		} catch (GerarBoletoException e) {
			System.out.println("Erro ao gerar boleto \n ERRO: " + e.getMessage());
		}
		
		return venda;
	}
}
