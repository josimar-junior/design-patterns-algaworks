package seguro;

import model.Cliente;

public class PropostaSeguro {

	private CalculadoraPremioSeguro calculadoraPremioSeguro;
	private Cliente cliente;
	private double valorVeiculo;

	public PropostaSeguro(Cliente cliente, double valorVeiculo) {
		this.cliente = cliente;
		this.valorVeiculo = valorVeiculo;
	}

	public String gerar() {
		return "O valor do seguro para o cliente " + cliente.getNome() + " é de "
				+ calculadoraPremioSeguro.calcular(valorVeiculo);
	}

	public void setCalculadoraPremioSeguro(CalculadoraPremioSeguro calculadoraPremioSeguro) {
		this.calculadoraPremioSeguro = calculadoraPremioSeguro;
	}

}
