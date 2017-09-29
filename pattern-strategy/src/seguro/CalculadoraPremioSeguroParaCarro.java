package seguro;

public class CalculadoraPremioSeguroParaCarro implements CalculadoraPremioSeguro {

	@Override
	public double calcular(double valorVeiculo) {
		return valorVeiculo * 0.9;
	}

}
