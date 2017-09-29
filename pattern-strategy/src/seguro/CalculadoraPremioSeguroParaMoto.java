package seguro;

public class CalculadoraPremioSeguroParaMoto implements CalculadoraPremioSeguro {

	@Override
	public double calcular(double valorVeiculo) {
		return valorVeiculo * 0.7;
	}

}
